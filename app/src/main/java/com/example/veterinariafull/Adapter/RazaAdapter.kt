package com.example.veterinariafull.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.veterinariafull.DB.Entitys.RazaEntity
import com.example.veterinariafull.R
import com.example.veterinariafull.databinding.ItemRazaBinding

class RazaAdapter(var Raza: MutableList<RazaEntity>) : RecyclerView.Adapter<RazaAdapter.Holder>() {
    inner class Holder(var binding: ItemRazaBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            ItemRazaBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        var raza = Raza.get(position)
        raza.apply {
            holder.binding.apply {
                txtRaza.text = Nombre
                txtNumero.text = "$Id. "
            }
        }
    }

    override fun getItemCount(): Int {
        return Raza.size
    }
}