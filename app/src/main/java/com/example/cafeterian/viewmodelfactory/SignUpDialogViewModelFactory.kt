package com.example.cafeterian.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cafeterian.viewmodel.SignFragmentViewModel
import com.example.cafeterian.viewmodel.SignUpDialogViewModel

//MainViewModelFactory
@Suppress("UNCHECKED_CAST")
class SignUpDialogViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SignUpDialogViewModel::class.java)){
            return SignUpDialogViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}