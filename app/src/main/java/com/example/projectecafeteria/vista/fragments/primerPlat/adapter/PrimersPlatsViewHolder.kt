package com.example.projectecafeteria.vista.fragments.primerPlat.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectecafeteria.databinding.ItemRecyclerBinding
import com.example.projectecafeteria.model.Plats

class PrimersPlatsViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemRecyclerBinding.bind(view)

    fun render(primersPlats: Plats, onClickListener:(Plats) -> Unit) {
        binding.nomPlat.text = primersPlats.nom;
        binding.preuPlat.text = primersPlats.preu;
        Glide.with(binding.imatgePlat.context).load(primersPlats.foto).into(binding.imatgePlat);

        itemView.setOnClickListener {
            onClickListener(primersPlats)
        }
    }
}