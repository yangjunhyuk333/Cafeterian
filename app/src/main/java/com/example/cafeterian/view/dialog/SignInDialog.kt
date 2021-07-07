package com.example.cafeterian.view.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cafeterian.R
import com.example.cafeterian.databinding.DialogSignInBinding
import com.example.cafeterian.viewmodel.SignInDialogViewModel
import com.example.cafeterian.viewmodelfactory.SignInDialogViewModelFactory
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInDialog : BottomSheetDialogFragment() {

    private lateinit var dataBinding: DialogSignInBinding
    private lateinit var viewModel: SignInDialogViewModel
    private lateinit var viewModelFactory: SignInDialogViewModelFactory

    private val signTextData = "계정이 없으신가요?"
    private val signButtonTextData = "Login"

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        dataBinding =
            DataBindingUtil.inflate(inflater, R.layout.dialog_sign_in, container, false)

        viewModelFactory = SignInDialogViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory).get(SignInDialogViewModel::class.java)

        dataBinding.apply {
            myViewModel = viewModel
            lifecycleOwner = this@SignInDialog

            signButtonBox.signText = signTextData
            signButtonBox.signButtonText = signButtonTextData

            signButtonBox.selectSignText.setOnClickListener {
                findNavController().navigate(R.id.action_signInDialog_to_signUpDialog)
            }
        }

        return dataBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.CustomBottomSheetDialogTheme)
    }
}