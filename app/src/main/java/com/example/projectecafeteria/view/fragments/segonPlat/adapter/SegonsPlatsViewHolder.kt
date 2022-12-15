package com.example.projectecafeteria.vista.fragments.segonPlat.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectecafeteria.databinding.ItemRecyclerBinding
import com.example.projectecafeteria.model.Plats

class SegonsPlatsViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemRecyclerBinding.bind(view)

    fun render(segonsPlats: Plats, onClickListener:(Plats) -> Unit) {
        binding.nomPlat.text = segonsPlats.nom;
        binding.preuPlat.text = segonsPlats.preu;
        Glide.with(binding.imatgePlat.context).load(segonsPlats.foto).into(binding.imatgePlat)

        itemView.setOnClickListener {
            onClickListener(segonsPlats)
        }

    }
}