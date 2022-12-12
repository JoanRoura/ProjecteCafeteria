package com.example.projectecafeteria.vista.fragments.postres

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentPostresBinding
import com.example.projectecafeteria.model.Plats
import com.example.projectecafeteria.vista.fragments.postres.adapter.PostresAdapter

class PostresFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPostresBinding>(inflater, R.layout.fragment_postres, container,false)

        binding.recyclerPostres.layoutManager = LinearLayoutManager(this.context);
        binding.recyclerPostres.adapter = PostresAdapter(PostresProvider.postresList) { plats ->  onItemSelected( plats ) }

        binding.botoConfirmarPostres.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_postresFragment_to_pagarComandaFragment);
        }

        return binding.root
    }

    fun onItemSelected(plats: Plats) {
        Toast.makeText(this.context, "Plat escullit: " + plats.nom + " Preu del plat: "+ plats.preu, Toast.LENGTH_SHORT).show()
    }
}