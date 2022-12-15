package com.example.projectecafeteria.vista.fragments.postres.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectecafeteria.R
import com.example.projectecafeteria.model.Plats

class PostresAdapter(private val postresList: List<Plats>, private val onClickListener: (Plats) -> Unit): RecyclerView.Adapter<PostresViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        return PostresViewHolder(layoutInflater.inflate(R.layout.item_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: PostresViewHolder, position: Int) {
        val item = postresList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = postresList.size;
}