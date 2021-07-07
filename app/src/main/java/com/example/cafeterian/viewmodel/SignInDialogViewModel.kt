package com.example.cafeterian.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//MainViewModel
class SignInDialogViewModel : ViewModel() {

    var emailData = MutableLiveData<String>()
    var passwordData = MutableLiveData<String>()

    init {

    }

    fun observing() {

    }
}