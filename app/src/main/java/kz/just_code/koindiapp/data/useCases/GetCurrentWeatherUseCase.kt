package kz.just_code.koindiapp.data.useCases

import kz.just_code.koindiapp.data.network.WeatherResponse
import kz.just_code.koindiapp.data.repositories.WeatherRepository

interface GetCurrentWeatherUseCase {
    suspend fun execute(city: String): WeatherResponse?
}

class GetCurrentWeatherInteraction(
    private val repo: WeatherRepository
) : GetCurrentWeatherUseCase {
    override suspend fun execute(city: String): WeatherResponse? {
        return repo.getCurrentWeather(city)
    }
}

fun provideGetCurrentWeatherUseCase(repo: WeatherRepository): GetCurrentWeatherUseCase =
    GetCurrentWeatherInteraction(repo)

interface SearchWeatherUseCase {
    suspend fun execute(text: String): WeatherResponse?
}

class SearchWeatherInteraction(
    private val repo: WeatherRepository
) : SearchWeatherUseCase {
    override suspend fun execute(text: String): WeatherResponse? {
        return repo.searchWeather(text)
    }
}

fun provideSearchWeatherUseCase(repo: WeatherRepository): SearchWeatherUseCase =
    SearchWeatherInteraction(repo)