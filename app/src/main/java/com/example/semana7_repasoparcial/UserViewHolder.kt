package com.example.semana7_repasoparcial

import Beans.tablePost
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.semana7_repasoparcial.R

class UserViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val id=view.findViewById<TextView>(R.id.txtCardId)
    val Userid=view.findViewById<TextView>(R.id.txtCardUserid)
    val title=view.findViewById<TextView>(R.id.txtCardtitle)
    val body=view.findViewById<TextView>(R.id.txtCardBody)

    fun render(pos:tablePost){
        id.text=pos.id.toString()
        Userid.text=pos.userId.toString()
        title.text=pos.title.toString()
        body.text=pos.body.toString()
    }


}