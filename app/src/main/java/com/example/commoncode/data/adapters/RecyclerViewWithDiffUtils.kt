package com.example.commoncode.data.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.commoncode.data.models.Person
import com.example.commoncode.databinding.RowLayoutBinding
import java.util.Collections.emptyList

class RecyclerViewWithDiffUtils : RecyclerView.Adapter<RecyclerViewWithDiffUtils.MyViewHolder>() {

    private var oldPersonList = emptyList<Person>()

    class MyViewHolder(private val binding : RowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RowLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return oldPersonList.size
    }

    internal fun setData(newPersonList: List<Person>){
        val diffUtil = MyDiffUtils(oldPersonList,newPersonList)
        val diffResults = DiffUtil.calculateDiff(diffUtil)
        oldPersonList = newPersonList
        diffResults.dispatchUpdatesTo(this)
    }
}