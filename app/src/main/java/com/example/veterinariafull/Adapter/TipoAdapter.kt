package com.example.veterinariafull.Adapter

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.veterinariafull.DB.Entitys.TipoEntity
import com.example.veterinariafull.R
import com.example.veterinariafull.databinding.ItemTipoBinding

class TipoAdapter(var Tipo: MutableList<TipoEntity>) : RecyclerView.Adapter<TipoAdapter.Holder>() {
    inner class Holder(var binding: ItemTipoBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            ItemTipoBinding.bind(
                LayoutInflater.from(parent.context).inflate(R.layout.item_tipo, parent, false)
            )
        )
    }

    override fun getItemCount(): Int {
        return Tipo.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        var tipo = Tipo.get(position)
        tipo.apply {
            holder.binding.apply {
                txtTipo.text = Nombre
                txtNumero.text = Id.toString()
            }
        }
    }
}