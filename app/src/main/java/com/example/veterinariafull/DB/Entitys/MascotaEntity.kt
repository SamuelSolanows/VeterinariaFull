package com.example.veterinariafull.DB.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.veterinariafull.DB.Entitys.MascotaEntity.Companion.NOMBRE_TABLA
import java.util.Date

@Entity(tableName = NOMBRE_TABLA)
data class MascotaEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLM_ID) var Id: Long,
    @ColumnInfo(name = COLM_NOMBRE) var Nombre: String,
    @ColumnInfo(name = COLM_ID_TIPO) var IdTipo: Long,
    @ColumnInfo(name = COLM_ID_RAZA) var IdRaza: Long,
    @ColumnInfo(name = COLM_ID_VACUNA) var IdVacuma: Long,
    @ColumnInfo(name = COLM_FECHA) var Fecha: String,

    ) {
    companion object {
        const val NOMBRE_TABLA = "Mascota"
        const val COLM_ID = "Id"
        const val COLM_NOMBRE = "Nombre"
        const val COLM_ID_TIPO = "IdTipo"
        const val COLM_ID_RAZA = "IdRaza"
        const val COLM_ID_VACUNA = "IdVacuma"
        const val COLM_FECHA = "Fecha"
    }
}