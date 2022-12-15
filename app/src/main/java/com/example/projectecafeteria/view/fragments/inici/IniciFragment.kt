package com.example.projectecafeteria.vista.fragments.inici

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentIniciBinding


class IniciFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentIniciBinding>(inflater, R.layout.fragment_inici,container,false);

        binding.botoIniciarComanda.setOnClickListener {
             view?.findNavController()?.navigate(R.id.action_iniciFragment_to_primerPlatFragment);
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}