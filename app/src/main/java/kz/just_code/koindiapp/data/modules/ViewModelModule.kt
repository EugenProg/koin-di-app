package kz.just_code.koindiapp.data.modules

import kz.just_code.koindiapp.data.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel(
            getCurrentWeather = get(),
            searchWeather = get(),
            repository = get()
        )
    }
}