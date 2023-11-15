package kz.just_code.koindiapp.data.modules

import kz.just_code.koindiapp.data.repositories.provideWeatherRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { provideWeatherRepository(api = get()) }
}

