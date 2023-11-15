package kz.just_code.koindiapp

import android.app.Application
import kz.just_code.koindiapp.data.modules.networkModule
import kz.just_code.koindiapp.data.modules.repositoryModule
import kz.just_code.koindiapp.data.modules.useCaseModule
import kz.just_code.koindiapp.data.modules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KoinApplication)
            modules(
                networkModule,
                useCaseModule,
                repositoryModule,
                viewModelModule
            )
        }
    }
}

