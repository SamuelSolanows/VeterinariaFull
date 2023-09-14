package com.example.veterinariafull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinariafull.databinding.ActivityTipoBinding

class Tipo : AppCompatActivity() {
    lateinit var binding: ActivityTipoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}