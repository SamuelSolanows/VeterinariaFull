package com.example.veterinariafull.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.veterinariafull.DB.Entitys.VacunaEntity
import com.example.veterinariafull.R
import com.example.veterinariafull.databinding.ItemVacunaBinding

class VacunaAdapter(var Vacuna: MutableList<VacunaEntity>) :
    RecyclerView.Adapter<VacunaAdapter.Holder>() {
    inner class Holder(var binding: ItemVacunaBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            ItemVacunaBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        var vacuna = Vacuna.get(position)
        vacuna.apply {
            holder.binding.apply {
                txtVacuna.text = Nombre
                txtNumero.text = "$Id. "
            }
        }
    }

    override fun getItemCount(): Int {
        return Vacuna.size
    }
}