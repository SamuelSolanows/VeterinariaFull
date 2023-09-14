package com.example.veterinariafull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinariafull.databinding.ActivityRazaBinding

class Raza : AppCompatActivity() {
    lateinit var binding: ActivityRazaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRazaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}