package com.example.veterinariafull.DB.Entitys

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.veterinariafull.DB.Entitys.VacunaEntity.Companion.NOMBRE_TABLA


@Entity(
    tableName = NOMBRE_TABLA,
    foreignKeys = [ForeignKey(
        entity = TipoEntity::class,
        parentColumns = [RazaEntity.COLM_ID],
        childColumns = [VacunaEntity.COLM_IDTIPO]
    )]
)
data class VacunaEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLM_ID) var Id: Long,
    @ColumnInfo(name = COLM_NAME) var Nombre: String,
    @ColumnInfo(name = COLM_IDTIPO) var IdTipo: Long
) {

    companion object {
        const val NOMBRE_TABLA = "Vacuna"
        const val COLM_ID = "Id"
        const val COLM_NAME = "Name"
        const val COLM_IDTIPO = "IdTipo"

    }
}
