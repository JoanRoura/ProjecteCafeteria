package com.example.projectecafeteria.vista

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.projectecafeteria.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val textUsuari = findViewById<TextView>(R.id.text_usuari_register);
        val textContrasenya = findViewById<TextView>(R.id.text_contrasenya_register);
        val textCorreu = findViewById<TextView>(R.id.text_correu_register);

        val botoRegistrarse = findViewById<Button>(R.id.boto_registrarse);

        val intent = intent;

        botoRegistrarse.setOnClickListener {
            //TODO: Comporvar que el usuari no deixa ningun camp en blanc
            if (textUsuari.text != null && textContrasenya.text != null && textCorreu.text != null ) {
                intent.putExtra("Usuari", textUsuari.text.toString());
                intent.putExtra("Contrasenya", textContrasenya.text.toString());
                intent.putExtra("Correu", textCorreu.text.toString());

                setResult(Activity.RESULT_OK, intent);
                finish()
            } else {
                Toast.makeText(this, "Ningun camp pot quedar en blanc.",  Toast.LENGTH_LONG).show();
            }
        }
    }
}