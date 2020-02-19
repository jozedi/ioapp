package com.jozedix.android.samples.ioapp.features.splash.presentation.view

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.jozedix.android.samples.ioapp.R
import com.jozedix.android.samples.core.platform.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment() {

    private val viewModel by viewModel<SplashViewModel>()

    override fun getLayout() = R.layout.fragment_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.completed.observe(this, Observer { state: Boolean ->
            if (!state) return@Observer
            goToHome()
        })
    }

    private fun goToHome() {
        findNavController().navigate(R.id.splashToHomeActivity)
        activity?.finish()
    }
}
