package com.example.projectecafeteria.vista.fragments.sharedVM

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.projectecafeteria.model.Plats

class SharedViewModel: ViewModel() {

    val primerPlat = MutableLiveData<Plats>();
    val segonPlat = MutableLiveData<Plats>();
    val postres = MutableLiveData<Plats>();

}