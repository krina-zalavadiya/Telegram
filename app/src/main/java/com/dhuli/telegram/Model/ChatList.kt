package com.dhuli.telegram.Model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dhuli.telegram.R

class ChatList(Names: Array<String>) : RecyclerView.Adapter<ChatList.ChatHolder>() {
    var Names = Names

    class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameItem = itemView.findViewById<TextView>(R.id.namesItem)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {

        return  ChatHolder(LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false))


    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {

        holder.nameItem.text = Names[position]
    }

    override fun getItemCount(): Int {

        return  Names.size
    }


}