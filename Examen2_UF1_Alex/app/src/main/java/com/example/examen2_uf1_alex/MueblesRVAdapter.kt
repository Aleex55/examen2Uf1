package com.example.examen2_uf1_alex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.examen2_uf1_alex.model.Mueble

class MueblesRVAdapter : ListAdapter<Mueble, MueblesRVAdapter.MuebleHolder>(DiffCallback()){
    class MuebleHolder(view: View) : RecyclerView.ViewHolder(view)

    private lateinit var listener: RecyclerClickListener
    fun setItemListener(listener: RecyclerClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuebleHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.)
        val muebleHolder = MuebleHolder(v)

        return muebleHolder
    }
}