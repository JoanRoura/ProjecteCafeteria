package com.example.projectecafeteria.vista.fragments.primerPlat

import androidx.fragment.app.FragmentActivity
import com.example.projectecafeteria.model.Plats

class PrimersPlatsProvider(requireActivity: FragmentActivity) {
    companion object {
        val primersPlatsList = listOf<Plats>(
            Plats(
                "Arrros",
                "5€",
                "https://www.cocinista.es/download/bancorecursos/recetas/receta-arroz-glutinoso-vapor.jpg"
            ),
            Plats(
                "Arrros",
                "5€",
                "https://www.cocinista.es/download/bancorecursos/recetas/receta-arroz-glutinoso-vapor.jpg"
            ),
            Plats(
                "Arrros",
                "5€",
                "https://www.cocinista.es/download/bancorecursos/recetas/receta-arroz-glutinoso-vapor.jpg"
            ),
            Plats(
                "Arrros",
                "5€",
                "https://www.cocinista.es/download/bancorecursos/recetas/receta-arroz-glutinoso-vapor.jpg"
            ),
            Plats(
                "Arrros",
                "5€",
                "https://www.cocinista.es/download/bancorecursos/recetas/receta-arroz-glutinoso-vapor.jpg"
            )
        )
    }
}