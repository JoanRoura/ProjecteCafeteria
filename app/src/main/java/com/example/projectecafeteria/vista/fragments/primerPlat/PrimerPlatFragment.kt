package com.example.projectecafeteria.vista.fragments.primerPlat


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentPrimerPlatBinding
import com.example.projectecafeteria.model.Plats
import com.example.projectecafeteria.vista.fragments.primerPlat.adapter.PrimersPlatsAdapter
import com.example.projectecafeteria.vista.fragments.sharedVM.SharedViewModel


class PrimerPlatFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentPrimerPlatBinding>(inflater, R.layout.fragment_primer_plat,container,false);

        binding.recyclerPrimersPlats.layoutManager = LinearLayoutManager(this.context);
        binding.recyclerPrimersPlats.adapter = PrimersPlatsAdapter(PrimersPlatsProvider.primersPlatsList) { plats -> onItemSelected( plats ) }

        binding.botoConfirmarPrimersPlats.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_primerPlatFragment_to_segonPlatFragment);
        }

        return binding.root
    }

    fun onItemSelected(plats: Plats) {
        val model = SharedViewModel().primerPlat;
        model.value = plats;
        Toast.makeText(this.context, "Plat escullit: " + plats.nom + " Preu del plat: "+ plats.preu, Toast.LENGTH_SHORT).show()
    }
}