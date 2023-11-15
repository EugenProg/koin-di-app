package kz.just_code.koindiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.just_code.koindiapp.data.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getCurrentWeather("asdf")
        viewModel.currentWeather.observe(this) {

        }
    }
}