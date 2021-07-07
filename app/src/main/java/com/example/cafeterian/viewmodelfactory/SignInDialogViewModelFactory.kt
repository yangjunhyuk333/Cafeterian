package com.example.cafeterian.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cafeterian.viewmodel.SignInDialogViewModel

//MainViewModelFactory
@Suppress("UNCHECKED_CAST")
class SignInDialogViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SignInDialogViewModel::class.java)){
            return SignInDialogViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}