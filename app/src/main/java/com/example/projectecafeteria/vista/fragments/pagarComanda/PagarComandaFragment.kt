package com.example.projectecafeteria.vista.fragments.pagarComanda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentPrimerPlatBinding
import com.example.projectecafeteria.vista.fragments.sharedVM.SharedViewModel

class PagarComandaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentPrimerPlatBinding>(inflater, R.layout.fragment_primer_plat,container,false);

        val model = SharedViewModel();

        model.primerPlat.observe(viewLifecycleOwner, Observer {

        })

        return binding.root
    }
}