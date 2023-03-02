package com.example.price

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.price.databinding.FragmentDollarBinding

class DollarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDollarBinding.inflate(LayoutInflater.from(activity),container,false)

        val mockList = mutableListOf<String>("dollar","euro","rial")
        binding.dollarRecyclerView.layoutManager = LinearLayoutManager(activity)
        binding.dollarRecyclerView.adapter = MyAdapter(mockList)

        return binding.root
    }

}