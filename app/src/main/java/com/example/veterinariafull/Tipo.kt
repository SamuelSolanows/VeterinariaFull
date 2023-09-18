package com.example.veterinariafull

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.veterinariafull.Adapter.TipoAdapter
import com.example.veterinariafull.DB.DBConexion
import com.example.veterinariafull.databinding.ActivityTipoBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Tipo : AppCompatActivity() {
    lateinit var binding: ActivityTipoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LlenarRecycle()
    }

    fun LlenarRecycle() {
        CoroutineScope(Dispatchers.IO).launch {

            var get = DBConexion.Getdatabase(this@Tipo).TipoDao().GetAll().toMutableList()
            runOnUiThread {
                binding.apply {
                    RecycleTipo.layoutManager = LinearLayoutManager(this@Tipo)

                    RecycleTipo.adapter = TipoAdapter(
                        get
                    )
                }
            }

        }
    }
}