package com.example.projectecafeteria.vista.fragments.segonPlat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectecafeteria.R
import com.example.projectecafeteria.databinding.FragmentSegonPlatBinding
import com.example.projectecafeteria.vista.fragments.segonPlat.adapter.SegonsPlatsAdapter

class SegonPlatFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  DataBindingUtil.inflate<FragmentSegonPlatBinding>(inflater, R.layout.fragment_segon_plat,container,false);

        binding.recyclerSegonsPlats.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerSegonsPlats.adapter = SegonsPlatsAdapter(SegonsPlatsProvider.segonsPlatsList)

        binding.botoConfirmarSegonsPlats.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_segonPlatFragment_to_postresFragment);
        }

        return binding.root
    }

}