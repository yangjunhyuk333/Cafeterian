package com.example.cafeterian.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.cafeterian.R
import com.example.cafeterian.databinding.ActivityMainBinding
import com.example.cafeterian.viewmodel.MainActivityViewModel
import com.example.cafeterian.viewmodelfactory.MainActivityViewModelFactory
import dagger.hilt.android.AndroidEntryPoint

//MainActivity
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding //MainDataBinding
    private lateinit var viewModel: MainActivityViewModel //MainViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory //MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

    }
}