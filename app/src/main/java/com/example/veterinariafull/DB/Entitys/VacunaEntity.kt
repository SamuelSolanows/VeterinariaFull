package com.example.veterinariafull.DB.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.veterinariafull.DB.Entitys.VacunaEntity.Companion.NOMBRE_TABLA


@Entity(tableName = NOMBRE_TABLA)
data class VacunaEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLM_ID) var Id: Long,
    @ColumnInfo(name = COLM_NAME) var Nombre: String
) {

    companion object {
        const val NOMBRE_TABLA = "Vacuna"
        const val COLM_ID = "Id"
        const val COLM_NAME = "Name"
    }
}
