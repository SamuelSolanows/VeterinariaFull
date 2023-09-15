package com.example.veterinariafull.DB.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.veterinariafull.DB.Entitys.RazaEntity.Companion.NOMBRE_TABLA

@Entity(
    tableName = NOMBRE_TABLA,
    foreignKeys = [ForeignKey(
        entity = TipoEntity::class,
        parentColumns = ["Id"],
        childColumns = ["IdTipo"]
    )
    ]
)
data class RazaEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLM_ID) var Id: Long,
    @ColumnInfo(name = COLM_NAME) var Nombre: String,
    @ColumnInfo(name = COLM_IDTIPO) var IdTipo: Long
) {
    override fun toString(): String {
        return COLM_NAME
    }

    companion object {
        const val NOMBRE_TABLA = "Raza"
        const val COLM_ID = "Id"
        const val COLM_NAME = "Name"
        const val COLM_IDTIPO = "IdTipo"
    }
}