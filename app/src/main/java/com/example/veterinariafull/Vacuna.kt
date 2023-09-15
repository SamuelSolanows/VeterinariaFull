package com.example.veterinariafull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.veterinariafull.Adapter.VacunaAdapter
import com.example.veterinariafull.DB.DBConexion
import com.example.veterinariafull.databinding.ActivityVacunaBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Vacuna : AppCompatActivity() {
    lateinit var binding: ActivityVacunaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVacunaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LlenarRecycle()
    }

    fun LlenarRecycle() {
        binding.apply {
            RecucleVacunas.layoutManager = LinearLayoutManager(this@Vacuna)
            CoroutineScope(Dispatchers.IO).launch {
                RecucleVacunas.adapter = VacunaAdapter(
                    DBConexion.Getdatabase(this@Vacuna).VacunaDao().GetAll().toMutableList()
                )

            }
        }
    }
}