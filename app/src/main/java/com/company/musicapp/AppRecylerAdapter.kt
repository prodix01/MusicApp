package com.company.musicapp

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.log

abstract class RecylerAdapter : RecyclerView.Adapter<AppViewHolder>() {

    private var modelList = ArrayList<MyModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {

        return AppViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recyler_item, parent))

    }

    override fun getItemCount(): Int {
        return this.modelList.size

    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.bind(this.modelList[position])
        Log.d("log", "로그로")
    }

    fun submitList(modelList: ArrayList<MyModel>) {
        this.modelList = modelList
    }

}