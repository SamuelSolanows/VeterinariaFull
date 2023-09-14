package com.example.veterinariafull.DB.Iterfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import com.example.veterinariafull.DB.Entitys.MascotaEntity

@Dao
interface IMascota {
    @Insert(onConflict = IGNORE)
    fun Create(Mascota: MascotaEntity)
}