package com.example.projectecafeteria.vista.fragments.segonPlat

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentSegonPlatBinding
import com.example.projectecafeteria.model.Plats
import com.example.projectecafeteria.vista.fragments.segonPlat.adapter.SegonsPlatsAdapter
import com.example.projectecafeteria.vista.fragments.sharedVM.SharedViewModel

class SegonPlatFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentSegonPlatBinding>(inflater, R.layout.fragment_segon_plat,container,false);

        binding.recyclerSegonsPlats.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerSegonsPlats.adapter = SegonsPlatsAdapter(SegonsPlatsProvider.segonsPlatsList) { plats -> onItemSelected( plats ) }

        binding.botoConfirmarSegonsPlats.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_segonPlatFragment_to_postresFragment);
        }

        return binding.root
    }

    fun onItemSelected(plats: Plats) {
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        model.segonPlat.value = plats

        Log.i("PrimerPlatFragment", model.segonPlat.value!!.nom );
        Toast.makeText(this.context, "Plat escullit: " + plats.nom + " Preu del plat: "+ plats.preu, Toast.LENGTH_SHORT).show()
    }



}