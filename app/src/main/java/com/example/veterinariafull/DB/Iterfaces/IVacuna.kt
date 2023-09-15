package com.example.veterinariafull.DB.Iterfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import androidx.room.Update
import com.example.veterinariafull.DB.Entitys.VacunaEntity

@Dao
interface IVacuna {
    @Insert(onConflict = IGNORE)
    fun Insertar(vacuna: VacunaEntity): Long

    @Query("SELECT * FROM ${VacunaEntity.NOMBRE_TABLA}")
    fun GetAll(): List<VacunaEntity>

    @Query("SELECT * FROM ${VacunaEntity.NOMBRE_TABLA} WHERE ${VacunaEntity.COLM_ID}=:Id")
    fun GetById(Id: Long): VacunaEntity?

    @Update
    fun Actualizar(vacuna: VacunaEntity)

    @Delete
    fun Eliminar(vacuna: VacunaEntity)

    @Query("SELECT * FROM ${VacunaEntity.NOMBRE_TABLA} WHERE ${VacunaEntity.COLM_ID}=:Id")
    fun EliminarById(Id: Long): Long
}