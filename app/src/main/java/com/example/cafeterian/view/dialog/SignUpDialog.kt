package com.example.cafeterian.view.dialog

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.cafeterian.R
import com.example.cafeterian.databinding.DialogSignUpBinding
import com.example.cafeterian.databinding.DialogSignUpTabletBinding
import com.example.cafeterian.viewmodel.SignUpDialogViewModel
import com.example.cafeterian.viewmodelfactory.SignUpDialogViewModelFactory
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpDialog : BottomSheetDialogFragment() {

    private lateinit var dataBinding1: DialogSignUpTabletBinding
    private lateinit var dataBinding2: DialogSignUpBinding
    private lateinit var viewModel: SignUpDialogViewModel
    private lateinit var viewModelFactory: SignUpDialogViewModelFactory

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        dataBinding1 = DataBindingUtil.inflate(inflater, R.layout.dialog_sign_up_tablet, container, false)
        dataBinding2 = DataBindingUtil.inflate(inflater, R.layout.dialog_sign_up, container, false)
        viewModelFactory = SignUpDialogViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory).get(SignUpDialogViewModel::class.java)

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            dataBinding1.apply {
                myViewModel = viewModel
                lifecycleOwner = this@SignUpDialog

                signButtonBox.signText = "계정이 있으십니까?"
                signButtonBox.signButtonText = "Signup"

                signButtonBox.selectSignText.setOnClickListener {
                    findNavController().navigate(R.id.action_signUpDialog_to_signInDialog)
                }

            }

            return dataBinding1.root
        } else {

            dataBinding2.apply {
                myViewModel = viewModel
                lifecycleOwner = this@SignUpDialog

                signButtonBox.signText = "계정이 있으십니까?"
                signButtonBox.signButtonText = "Signup"

                signButtonBox.selectSignText.setOnClickListener {
                    findNavController().navigate(R.id.action_signUpDialog_to_signInDialog)
                }

            }

            return dataBinding2.root
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme)
    }
}