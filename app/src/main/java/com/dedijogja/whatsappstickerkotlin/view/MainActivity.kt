package com.dedijogja.whatsappstickerkotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dedijogja.whatsappstickerkotlin.databinding.ActivityMainBinding
import com.dedijogja.whatsappstickerkotlin.repo.Api
import com.dedijogja.whatsappstickerkotlin.utils.Constant
import com.dedijogja.whatsappstickerkotlin.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.getValue().observe(this, Observer {
            if(it != null){

            }
        })

        mainViewModel.setValue(this)

    }

}