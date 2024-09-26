package com.example.commoncode.ui.activities

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.commoncode.R
import com.example.commoncode.domain.utils.Extensions.showToast
import com.example.commoncode.domain.utils.LocaleHelper


class MainActivity : AppCompatActivity() {
    //    private val adapter by lazy{
//        RecyclerViewWithDiffUtils()
//    }

//    private var navController: NavController? = null

//    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast { resources.getString(R.string.app_name) }

//        viewLifeCycleOwner.lifeCycleScope.launchWhenStarted {
//            binding.userName.textChange().debounce(400L).collect {
//                it:Editable?
//                Log.d(TAG, ” onCreate $it”)
//            }
//        }

    }

//    override fun attachBaseContext(base: Context?) {
//        super.attachBaseContext(base?.let { LocaleHelper.onAttach(it) })
//    }

//    private fun init() {
//
//        this@MainActivity.window.statusBarColor =
//            ContextCompat.getColor(this@MainActivity, R.color.activity_bg)
//
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
//        navController = navHostFragment.navController
//        navController?.let { controller ->
//            NavigationUI.setupWithNavController(
//                binding.bottomNavigationView,
//                controller
//            )
//        }
//    }

//    private fun listeners() {
//        navController?.addOnDestinationChangedListener { controller, destination, arguments ->
//            sharedViewModel.setFindNavController(controller)
//            sharedViewModel.setCurrentFragmentDestination(destination.id)
//            if (destination.id == R.id.feedbackFragment
//                || destination.id == R.id.mediaSelectionFragment
//                || destination.id == R.id.searchFragment
//                || destination.id == R.id.videosInFolderFragment
//                || destination.id == R.id.videosInPlaylistFragment
//            ) {
//                binding.bottomNavigationView.gone()
//            } else {
//                if (checkStoragePermissions()) {
//                    binding.bottomNavigationView.visible()
//                }
//            }
//        }
//    }

//    private fun backPressed() {
//        sharedViewModel.getFindNavController()?.canGoBack {
//            if (it){
//                sharedViewModel.getFindNavController()?.popBackStack()
//            }
//        }
//    }
//
//    Note => Extension function
//    inline fun NavController.canGoBack(isPressed:(Boolean)->Unit){
//        isPressed.invoke(this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED)
//    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)

    }

//    private fun showPopUpSetStartTime() {
//    val bind = SetStartOrEndTimeDialogBinding.inflate(layoutInflater)
//    val dialog = context?.let { Dialog(it) }
//    dialog?.setContentView(bind.root)
//    dialog?.setCancelable(true)
//    dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//    dialog?.window?.setLayout(
//        WindowManager.LayoutParams.MATCH_PARENT,
//        WindowManager.LayoutParams.WRAP_CONTENT
//    )
//
//    //For Bottom Dialog
//    val lp = WindowManager.LayoutParams()
//    lp.copyFrom(exitDialog.window?.attributes)
//    lp.width = WindowManager.LayoutParams.MATCH_PARENT
//    lp.height = WindowManager.LayoutParams.WRAP_CONTENT
//    lp.gravity = Gravity.TOP
//    exitDialog.window?.attributes = lp
//    exitDialog.setCancelable(true)
//    exitDialog.show()
//}

    override fun onWindowAttributesChanged(params: WindowManager.LayoutParams?) {
        super.onWindowAttributesChanged(params)
    }

    // * Note add this in MainActivity Manifest File  android:launchMode="singleTask"
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        // Handle the new intent here
        if (intent.hasExtra("extra_data")) {
            val data = intent.getStringExtra("extra_data")
            // Update your activity's UI or perform other actions based on the new data
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onNightModeChanged(mode: Int) {
        super.onNightModeChanged(mode)
    }

//    private fun setRecyclerViewWithDiffUtilsAdapter(){
//        binding.recyclerView.adapter = adapter
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//        adapter.setData(listOf(Person(1,"Shahbaz",33)))
//    }

    /**
     * For Multiple RecyclerViews
     */

//    val initRecycler = {
//        binding.apply {
//            mainLayoutMain.recyclerview.adapter = menuAdapter
//            val layoutManager = mainLayoutMain.recyclerview.layoutManager as GridLayoutManager
//            layoutManager.spanSizeLookup =
//                object : GridLayoutManager.SpanSizeLookup() {
//                    override fun getSpanSize(position: Int): Int {
//                        return when (position) {
//                            0 -> 2
//                            menuAdapter.currentList.size - 1 -> 2
//                            1 -> 2
//                            menuAdapter.currentList.size - 2 -> 2
//                            else -> 1
//                        }
//                    }
//                }
//            menuAdapter.submitList(getData())
//        }
//    }
}