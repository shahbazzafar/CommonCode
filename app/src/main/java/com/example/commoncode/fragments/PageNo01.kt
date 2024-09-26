package com.example.commoncode.fragments

import android.app.Activity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//@Inject
//lateinit var binding: FragmentAudiosBinding
//
//private var isFirstLoaded: Boolean = false
//
////private var rootView: ViewGroup? = null

//if (rootView == null) {
//
//    isFirstLoaded = true
//    rootView = binding.root
//} else {
//    isFirstLoaded = false
//}
//
//return rootView as ViewGroup

//(1)
//Note: For back to previous fragment
//if (findNavController().previousBackStackEntry?.destination?.id == R.id.mainFragment){
//    findNavController().popBackStack()
//}

//(2)
//private fun openMainFragment() {
//    if (findNavController().currentDestination?.id == R.id.languagesFragment) {
//        val navOptions = NavOptions.Builder().setPopUpTo(R.id.languagesFragment, true).build()
//        findNavController().navigate(R.id.action_languagesFragment_to_mainFragment, null, navOptions)
//    }
//}

//(3)
//if (isVisible) {
//    val nativeVideoSites = NativeHelper2(it)
//    mainContainer.canShow(true)
//    nativeVideoSites.loadAdsWithConfiguration(mainContainer, admobContainer, 120, getString(R.string.native_ad_id), "", 1)
//}

//(4)

//Use case:
//When the user logout. you want to clear the back stack and take the user to the login screen.
//fun clearAndNavigate(route: String){
//    navController.navigate(route){
//        launchSingleTop = true
//        popUpTo(0) {
//            inclusive = true
//        }
//    }
//}

//(5)
//private fun NavController.isFragmentRemovedFromBackStack(destinationId: Int) =
//    try {
//        getBackStackEntry(destinationId)
//        false
//    } catch (e: Exception) {
//        true
//    }

//(6)
//private val currentNavOptions =
//    NavOptions.Builder().setEnterAnim(android.R.anim.slide_in_left).setExitAnim(android.R.anim.slide_out_right).setPopEnterAnim(android.R.anim.slide_out_right).setPopExitAnim(android.R.anim.slide_in_left).build()
//
//fun navigateToFragment(fragmentId: Int, actionId: Int? = null, bundle: Bundle = bundleOf(), navOptions: NavOptions = currentNavOptions) {
//    CoroutineScope(Dispatchers.Main).launch {
//        findNavController().apply {
//            if (currentDestination?.id != fragmentId) {
//                if (!isFragmentRemovedFromBackStack(fragmentId)) {
//                    popBackStack(fragmentId, false)
//                } else {
//                    try {
//                        if (actionId != null)
//                            navigate(actionId, bundle/*, navOptions*/)
//                        else
//                            navigate(fragmentId, bundle/*, navOptions*/)
//                    } catch (e: Exception) {
//                        navigate(fragmentId, bundle/*, navOptions*/)
//                    }
//                }
//            }
//        }
//    }
//}

//Note: How to use?
//if (findNavController().currentDestination?.id == R.id.firstCleanUpFragment) {
//    val navOptions = NavOptions.Builder()
//        .setEnterAnim(android.R.anim.fade_in)
//        .setExitAnim(android.R.anim.fade_out)
//        .setPopEnterAnim(android.R.anim.fade_in)
//        .setPopExitAnim(android.R.anim.fade_out)
//        .setPopUpTo(R.id.firstCleanUpFragment, true)
//        .build()
//    navigateToFragment(R.id.boostFragment, navOptions = navOptions)
//}

//Or

//if (findNavController().currentDestination?.id == R.id.mediaFragment) {
//    val bundle: Bundle = bundleOf()
//    bundle.putString("folderUri", File(mediaViewModel.tempMap.keys.elementAt(1)).toString())
//    navigateToFragment(R.id.singleMediaFolderFragment, bundle = bundle)
//}

//(7)
//fun configureBackPress(backPressed: () -> Unit) {
//    backPressedCallback = object : OnBackPressedCallback(true) {
//        override fun handleOnBackPressed() {
//            if (SystemClock.elapsedRealtime() - Extensions.lastClickTime < 600) return
//            else {
//                //postAnalytic(analytics)
//                backPressed()
//            }
//            Extensions.lastClickTime = SystemClock.elapsedRealtime()
//        }
//    }
//    requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backPressedCallback)
//}