package com.example.veterinariafull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinariafull.DB.DBConexion
import com.example.veterinariafull.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        CambiuarActividad()
        DBConexion.Getdatabase(this)
    }

    fun CambiuarActividad() {
        binding.apply {
            btnTipo.setOnClickListener {
                startActivity(Intent(this@MainActivity, Tipo::class.java))
            }
            btnMascota.setOnClickListener {
                startActivity(Intent(this@MainActivity, Mascota::class.java))
            }
            btnRaza.setOnClickListener {
                startActivity(Intent(this@MainActivity, Raza::class.java))
            }
            btnVacuna.setOnClickListener {
                startActivity(Intent(this@MainActivity, Vacuna::class.java))
            }
        }
    }


}