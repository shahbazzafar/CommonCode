package com.example.commoncode.ui.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.commoncode.R
import com.example.commoncode.domain.utils.Extensions.showToast

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