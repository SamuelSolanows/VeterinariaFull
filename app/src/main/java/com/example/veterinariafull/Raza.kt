package com.example.veterinariafull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.veterinariafull.Adapter.RazaAdapter
import com.example.veterinariafull.DB.DBConexion
import com.example.veterinariafull.databinding.ActivityRazaBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Raza : AppCompatActivity() {
    lateinit var binding: ActivityRazaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRazaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.RecucleRaza.layoutManager=LinearLayoutManager(this)
        CoroutineScope(Dispatchers.IO).launch {
            binding.RecucleRaza.adapter=RazaAdapter(DBConexion.Getdatabase(this@Raza).RazaDao().GetAll().toMutableList())
        }

    }
}