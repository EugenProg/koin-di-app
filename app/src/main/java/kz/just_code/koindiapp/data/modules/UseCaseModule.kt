package kz.just_code.koindiapp.data.modules

import kz.just_code.koindiapp.data.useCases.provideGetCurrentWeatherUseCase
import kz.just_code.koindiapp.data.useCases.provideSearchWeatherUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory {
        provideGetCurrentWeatherUseCase(get())
    }
    factory {
        provideSearchWeatherUseCase(get())
    }
}