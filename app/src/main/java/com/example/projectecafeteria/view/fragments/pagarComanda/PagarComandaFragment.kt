package com.example.projectecafeteria.vista.fragments.pagarComanda

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentPagarComandaBinding
import com.example.projectecafeteria.vista.fragments.sharedVM.SharedViewModel

class PagarComandaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentPagarComandaBinding>(inflater, R.layout.fragment_pagar_comanda,container,false);

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        model.primerPlat.observe(viewLifecycleOwner, Observer {
            binding.textNomPrimerPlat.text = it.nom
            binding.textPreuPrimerPlat.text = it.preu

            val preuPrimerPlat = it.preu
        })

        model.segonPlat.observe(viewLifecycleOwner, Observer {
            binding.textNomSegonPlat.text = it.nom
            binding.textPreuSegonPlat.text = it.preu
        })

        model.postres.observe(viewLifecycleOwner, Observer {
            binding.textNomPostre.text = it.nom
            binding.textPreuPostres.text = it.preu
        })

        return binding.root
    }
}