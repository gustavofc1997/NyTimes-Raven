package com.gustavofc97.nytimes.ui.home

import com.gustavofc97.nytimes.data.entity.Message

/**
 * Sealed class to represent UI states in [HomeScreen]
 */
sealed interface HomeScreenUiState {
    data object Initial : HomeScreenUiState
    data object Loading : HomeScreenUiState
    data class Success(val msg: Message) : HomeScreenUiState
    data class Error(val msg: String) : HomeScreenUiState
}
