package com.example.commoncode.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.commoncode.R
import com.example.commoncode.data.adapters.RecyclerViewWithDiffUtils
import com.example.commoncode.data.models.Person

class MainActivity : AppCompatActivity() {
//    private val adapter by lazy{
//        RecyclerViewWithDiffUtils()
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun setRecyclerViewWithDiffUtilsAdapter(){
//        binding.recyclerView.adapter = adapter
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//        adapter.setData(listOf(Person(1,"Shahbaz",33)))
//    }
}