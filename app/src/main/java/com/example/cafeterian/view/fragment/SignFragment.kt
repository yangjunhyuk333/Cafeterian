package com.example.cafeterian.view.fragment

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.cafeterian.R
import com.example.cafeterian.databinding.FragmentSignBinding
import com.example.cafeterian.databinding.FragmentSignTabletBinding
import com.example.cafeterian.view.dialog.SignInDialog
import com.example.cafeterian.viewmodel.SignFragmentViewModel
import com.example.cafeterian.viewmodelfactory.SignFragmentViewModelFactory
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignFragment : Fragment() {

    private lateinit var dataBinding1: FragmentSignTabletBinding
    private lateinit var dataBinding2: FragmentSignBinding
    private lateinit var viewModel: SignFragmentViewModel
    private lateinit var viewModelFactory: SignFragmentViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        viewModelFactory = SignFragmentViewModelFactory()
        viewModel =
            ViewModelProvider(this, viewModelFactory).get(SignFragmentViewModel::class.java)

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            dataBinding1 =
                DataBindingUtil.inflate(inflater, R.layout.fragment_sign_tablet, container, false)

            dataBinding1.apply {
                myViewModel = viewModel
                lifecycleOwner = this@SignFragment

                emailButton.setOnClickListener {
                    view?.findNavController()?.navigate(R.id.action_signFragment_to_signInDialog)
                }

                signText.setOnClickListener {
                    view?.findNavController()?.navigate(R.id.action_signFragment_to_signUpDialog)
                }


            }

            return dataBinding1.root

        } else {

            dataBinding2 =
                DataBindingUtil.inflate(inflater, R.layout.fragment_sign, container, false)

            dataBinding2.apply {
                myViewModel = viewModel
                lifecycleOwner = this@SignFragment

                emailButton.setOnClickListener {
                    view?.findNavController()?.navigate(R.id.action_signFragment_to_signInDialog)
                }

                signText.setOnClickListener {
                    view?.findNavController()?.navigate(R.id.action_signFragment_to_signUpDialog)
                }
            }

            return dataBinding2.root

        }

    }
}