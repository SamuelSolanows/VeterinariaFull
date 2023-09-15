package com.example.veterinariafull

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.veterinariafull.DB.DBConexion
import com.example.veterinariafull.databinding.ActivityMascotaBinding
import com.example.veterinariafull.databinding.AlertMascotaBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Mascota : AppCompatActivity() {
    lateinit var binding: ActivityMascotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMascotaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MostrarAlerta()
    }

    fun MostrarAlerta() {
        var vinding: AlertMascotaBinding
        vinding = AlertMascotaBinding.inflate(layoutInflater)
        var alert = AlertDialog.Builder(this@Mascota).setView(vinding.root).create()
        vinding.apply {
            btnGuardar.setOnClickListener {
                if (txtNombre.text!!.isNotEmpty() && txtCalendar.text!!.isNotEmpty()) {
                    Toast.makeText(this@Mascota, "Se puede guardar", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@Mascota, "Faltan campos por lleanr", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            btnCancelar.setOnClickListener {
                AlertDialog.Builder(this@Mascota).setTitle("Cancelar registro")
                    .setMessage("Desea cancelar el registro de esta n8ieva mascota?")
                    .setPositiveButton("Si") { _, _ ->
                        alert.dismiss()
                        Toast.makeText(
                            this@Mascota,
                            "Registro de mascota cancelado",
                            Toast.LENGTH_SHORT
                        ).show()
                    }.setNegativeButton("No") { _, _ -> }.create().show()
            }


            txtCalendar.setOnClickListener {
                var a = DatePickerDialog(this@Mascota).show()
            }
        }


        binding.btnAgregarMascota.setOnClickListener {
            alert.show()
        }
    }
}