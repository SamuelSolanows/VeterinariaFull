package com.example.veterinariafull.DB.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.veterinariafull.DB.Entitys.ControlVacunaEntity.Companion.NOMBRE_TABLA

@Entity(tableName = NOMBRE_TABLA)
data class ControlVacunaEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLM_ID) var Id: Long,
    @ColumnInfo(name = COLM_ID_VACUNA) var IdVacuna: Long,
    @ColumnInfo(name = COLM_ID_MASCOTA) var IdMascota: Long

) {
    companion object {
        const val NOMBRE_TABLA = "ControlVacuna"
        const val COLM_ID = "Id"
        const val COLM_ID_VACUNA = "IdVacuna"
        const val COLM_ID_MASCOTA = "IdMascota"
    }
}


