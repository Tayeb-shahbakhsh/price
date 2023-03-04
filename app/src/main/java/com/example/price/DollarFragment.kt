package com.example.price

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.price.databinding.FragmentDollarBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DollarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDollarBinding.inflate(LayoutInflater.from(activity), container, false)

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://sharifmehr.com/")
            .build()

        val apiService = retrofit.create(ApiService::class.java)
        val call = apiService.getData()
        call.enqueue(object : Callback<MutableList<CurrencyData>> {
            override fun onResponse(
                call: Call<MutableList<CurrencyData>>,
                response: Response<MutableList<CurrencyData>>
            ) {

                val list = response.body()
                binding.dollarRecyclerView.layoutManager = LinearLayoutManager(activity)
                binding.dollarRecyclerView.adapter = MyAdapter(list)

            }

            override fun onFailure(call: Call<MutableList<CurrencyData>>, t: Throwable) {
                println(t)
            }
        })


        return binding.root
    }

}