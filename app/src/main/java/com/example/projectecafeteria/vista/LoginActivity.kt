package com.example.projectecafeteria.vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.projectecafeteria.R
import com.example.projectecafeteria.shared.StartGameDialogFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text_usuari = findViewById<TextView>(R.id.text_usuari);
        val text_contrasenya = findViewById<TextView>(R.id.text_contrasenya);

        val botoLogin = findViewById<Button>(R.id.boto_iniciarSessio);
        val botoRegistrarse = findViewById<Button>(R.id.boto_anarRegistre);

        val intentHome = Intent(this, HomeActivity::class.java);
        val intentRegister = Intent(this, RegisterActivity::class.java);


        //Retorna la informacio de activity Register
        var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            val data: Intent? = result.data
            if (result.resultCode == RESULT_OK) {
                val usuari = data?.getStringExtra("Usuari");
                val contrasenya = data?.getStringExtra("Contrasenya");
                val correu = data?.getStringExtra("Correu");

                text_usuari.text = usuari;
                text_contrasenya.text = contrasenya;

                if (text_usuari.text.toString().contains(usuari.toString()) && text_contrasenya.text.contains(contrasenya.toString())) {
                    //Anar a l'activiti Home
                    botoLogin.setOnClickListener {
                        startActivity(intentHome)
                    }
                } else {
                    Toast.makeText(this, "Les credencials no son correctes.", Toast.LENGTH_LONG).show();
                }
            }
        }

        botoLogin.setOnClickListener {
            startActivity(intentHome)
        }

        //Anar a la activity registre
        botoRegistrarse.setOnClickListener {
            resultLauncher.launch(intentRegister);
        }
    }
}