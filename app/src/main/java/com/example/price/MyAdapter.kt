package com.example.price

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.price.databinding.RecyclerLayoutBinding

class MyAdapter() : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: RecyclerLayoutBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder =
        MyViewHolder(
            RecyclerLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}