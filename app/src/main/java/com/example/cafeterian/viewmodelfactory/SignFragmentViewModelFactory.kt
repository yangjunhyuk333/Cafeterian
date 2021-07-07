package com.example.cafeterian.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cafeterian.viewmodel.SignFragmentViewModel

//MainViewModelFactory
@Suppress("UNCHECKED_CAST")
class SignFragmentViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SignFragmentViewModel::class.java)){
            return SignFragmentViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}