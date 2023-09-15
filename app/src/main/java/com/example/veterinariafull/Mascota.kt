package com.example.veterinariafull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.veterinariafull.databinding.ActivityMascotaBinding

class Mascota : AppCompatActivity() {
    lateinit var binding: ActivityMascotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMascotaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAgregarMascota.setOnClickListener {
            MostrarAlerta()
        }
    }

    fun MostrarAlerta() {
        AlertDialog.Builder(this@Mascota).setView(R.layout.alert_mascota).create()
    }
}