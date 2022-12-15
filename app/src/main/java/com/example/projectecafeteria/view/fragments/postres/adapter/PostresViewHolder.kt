package com.example.projectecafeteria.vista.fragments.postres.adapter

import android.content.DialogInterface.OnClickListener
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectecafeteria.databinding.ItemRecyclerBinding
import com.example.projectecafeteria.model.Plats

class PostresViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemRecyclerBinding.bind(view)

    fun render(postres: Plats, onClickListener: (Plats) -> Unit) {
        binding.nomPlat.text = postres.nom;
        binding.preuPlat.text = postres.preu;
        Glide.with(binding.imatgePlat.context).load(postres.foto).into(binding.imatgePlat);

        itemView.setOnClickListener {
            onClickListener(postres);
        }
    }
}