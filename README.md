# NyTimes

Built using [Jetpack Compose](https://developer.android.com/jetpack/compose) as the UI framework and following the [MVVM architecture pattern](https://developer.android.com/topic/architecture).

It includes the following popular libraries:

- [Hilt](https://dagger.dev/hilt) - Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.
- [Room](https://developer.android.com/training/data-storage/room) - Room persistence library provides an abstraction layer over SQLite to allow fluent database access while harnessing the full power of SQLite.
- [Retrofit](https://github.com/square/retrofit) - A type-safe HTTP client for Android and the JVM.
- [Moshi](https://github.com/square/moshi) - A modern JSON library for Kotlin and Java.
- [Coil](https://github.com/coil-kt/coil) - Image loading for Android backed by Kotlin Coroutines.

## Annotation Processing
This project uses [Kotlin Symbol Processing (KSP)](https://kotlinlang.org/docs/ksp-overview.html) for annotation processing, which provides faster build times compared to [KAPT](https://kotlinlang.org/docs/kapt.html). ~~However, some dependencies (like Hilt) may not support KSP yet, which is why KAPT is still used~~.

## Build and Configuration Caching
This project also takes advantage of Gradle's [Build Cache](https://docs.gradle.org/current/userguide/build_cache.html) and [Configuration Cache](https://docs.gradle.org/current/userguide/configuration_cache.html) features to speed up builds and reduce build times.
Note that these features may not always provide significant improvements in build times depending on the project structure and build complexity.
