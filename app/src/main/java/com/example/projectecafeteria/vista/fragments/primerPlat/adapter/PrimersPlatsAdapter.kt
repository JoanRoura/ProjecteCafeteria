package com.example.projectecafeteria.vista.fragments.primerPlat.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectecafeteria.R
import com.example.projectecafeteria.model.Plats

class PrimersPlatsAdapter(private val primersPlatsList: List<Plats>, private val onClickListener:(Plats) -> Unit): RecyclerView.Adapter<PrimersPlatsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrimersPlatsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        return PrimersPlatsViewHolder(layoutInflater.inflate(R.layout.item_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: PrimersPlatsViewHolder, position: Int) {
        val item = primersPlatsList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = primersPlatsList.size;

}