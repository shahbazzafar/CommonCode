package com.example.commoncode.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.commoncode.R
import com.example.commoncode.domain.utils.Extensions.showToast
import com.example.commoncode.domain.utils.LocaleHelper


class MainActivity : AppCompatActivity() {
    //    private val adapter by lazy{
//        RecyclerViewWithDiffUtils()
//    }
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

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)

    }

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