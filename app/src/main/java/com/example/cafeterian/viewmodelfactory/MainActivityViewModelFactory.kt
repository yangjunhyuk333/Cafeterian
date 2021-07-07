package com.example.cafeterian.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cafeterian.viewmodel.MainActivityViewModel

//MainViewModelFactory
@Suppress("UNCHECKED_CAST")
class MainActivityViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}