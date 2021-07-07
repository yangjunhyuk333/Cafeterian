package com.example.cafeterian.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeterian.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
    }
}