package com.example.projectecafeteria.vista.fragments.segonPlat.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectecafeteria.R
import com.example.projectecafeteria.model.Plats

class SegonsPlatsAdapter(private val segonsPlatsList: List<Plats>, private val onClickListener: (Plats) -> Unit): RecyclerView.Adapter<SegonsPlatsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SegonsPlatsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        return SegonsPlatsViewHolder(layoutInflater.inflate(R.layout.item_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: SegonsPlatsViewHolder, position: Int) {
        val item = segonsPlatsList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = segonsPlatsList.size;
}