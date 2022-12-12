package com.example.projectecafeteria.vista.fragments.inici

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentIniciBinding


class IniciFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentIniciBinding>(inflater, R.layout.fragment_inici,container,false);

        binding.botoIniciarComanda.setOnClickListener {
             view?.findNavController()?.navigate(R.id.action_iniciFragment_to_primerPlatFragment);
        }

        return binding.root
    }
}