package com.example.veterinariafull.DB.Entitys

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.veterinariafull.DB.Entitys.TipoEntity.Companion.NOMBRE_TABLA

@Entity(tableName = NOMBRE_TABLA)
data class TipoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLM_ID) var Id: Long,
    @ColumnInfo(name = COLM_NOMBRE) var Nombre: String
) {
    companion object {
        const val NOMBRE_TABLA = "Tipo"
        const val COLM_ID = "Id"
        const val COLM_NOMBRE = "Nombre"
    }
}
