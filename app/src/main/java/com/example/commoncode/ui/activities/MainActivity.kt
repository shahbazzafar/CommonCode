package com.example.commoncode.ui.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
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
}