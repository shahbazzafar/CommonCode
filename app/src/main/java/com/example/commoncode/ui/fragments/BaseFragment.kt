package com.example.commoncode.ui.fragments

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
//import androidx.navigation.NavController
//import androidx.navigation.NavOptions
//import androidx.navigation.fragment.findNavController
//import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch

open class BaseFragment : Fragment() {

//    private lateinit var myFirebaseAnalytics: FirebaseAnalytics
    private lateinit var backPressedCallback: OnBackPressedCallback
//    private fun NavController.isFragmentRemovedFromBackStack(destinationId: Int) =
//        try {
//            getBackStackEntry(destinationId)
//            false
//        } catch (e: Exception) {
//            true
//        }

//    private val navOptions = NavOptions.Builder()
//        .setEnterAnim(android.R.anim.fade_in)
//        .setExitAnim(android.R.anim.fade_out)
//        .setPopEnterAnim(android.R.anim.fade_in)
//        .setPopExitAnim(android.R.anim.fade_out).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        myFirebaseAnalytics = FirebaseAnalytics.getInstance(requireContext())
    }

    fun postAnalytic(event: String?) {
        val bundle = Bundle()
        bundle.putString(event, event)
        if (event == null)
            return
//        myFirebaseAnalytics.logEvent(event, bundle)
    }

    fun configureBackPress(backPressed: () -> Unit) {
        backPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                backPressed()
            }
        }
        activity?.onBackPressedDispatcher?.addCallback(
            viewLifecycleOwner,
            backPressedCallback
        )
    }

//    fun navigateToFragment(fragmentId: Int, actionId: Int?, bundle: Bundle = bundleOf()) {
//        CoroutineScope(Main).launch {
//            findNavController().apply {
//                if (currentDestination?.id != fragmentId) {
//                    if (!isFragmentRemovedFromBackStack(fragmentId)) {
//                        popBackStack(fragmentId, false)
//                    } else {
//                        try {
//                            if (actionId != null)
//                                navigate(actionId, bundle, navOptions)
//                            else
//                                navigate(fragmentId, bundle, navOptions)
//                        } catch (e: Exception) {
//                            navigate(fragmentId, bundle, navOptions)
//                        }
//                    }
//                }
//            }
//        }
//    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        if (::backPressedCallback.isInitialized) {
//            backPressedCallback.isEnabled = false
//            backPressedCallback.remove()
//        }
//    }
}