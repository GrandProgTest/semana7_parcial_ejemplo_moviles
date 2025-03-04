package com.example.semana7_repasoparcial

import Beans.tablePost
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.semana7_repasoparcial.R

class Adapter(val listaPost:List<tablePost>):RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return UserViewHolder(layoutInflater.inflate(R.layout.card,parent,false))
    }

    override fun getItemCount(): Int =listaPost.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val item=listaPost[position]
        holder.render(item)
    }


}