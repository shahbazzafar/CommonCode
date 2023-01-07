package com.example.commoncode.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.commoncode.R
import com.example.commoncode.domain.utils.Extensions.showToast

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        showToast { "Fragment" }
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}