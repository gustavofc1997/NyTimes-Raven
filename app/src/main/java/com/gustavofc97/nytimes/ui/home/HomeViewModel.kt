package com.gustavofc97.nytimes.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gustavofc97.nytimes.data.entity.Message
import com.gustavofc97.nytimes.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {
    private val _response = MutableStateFlow<HomeScreenUiState>(HomeScreenUiState.Initial)
    val response: StateFlow<HomeScreenUiState> = _response.asStateFlow()

    fun loadData() {
        viewModelScope.launch {
            _response.value = HomeScreenUiState.Loading

            try {
                /**
                 * Message object is explicitly marked as nullable because when we launch the app for the first time,
                 * the database will be empty and Flow will return null value.
                 * Once the [com.gustavofc97.nytimes.data.RoomDbInitializer] populate local database, the Flow will emit updated value.
                 */
                homeRepository.loadData().collect { message: Message? ->
                    message?.let { msg ->
                        _response.value = HomeScreenUiState.Success(msg = msg)
                    }
                }
            } catch (e: Exception) {
                _response.value = HomeScreenUiState.Error(msg = e.message ?: "Something went wrong")
            }
        }
    }
}
