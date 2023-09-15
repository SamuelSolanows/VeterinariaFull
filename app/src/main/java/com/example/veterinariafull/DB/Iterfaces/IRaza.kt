package com.example.veterinariafull.DB.Iterfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import androidx.room.Update
import com.example.veterinariafull.DB.Entitys.RazaEntity

@Dao
interface IRaza {

    @Insert(onConflict = IGNORE)
    fun Insertar(raza: RazaEntity): Long

    @Query("SELECT * FROM ${RazaEntity.NOMBRE_TABLA}")
    fun GetAll(): List<RazaEntity>

    @Query("SELECT * FROM ${RazaEntity.NOMBRE_TABLA} WHERE ${RazaEntity.COLM_ID}=:Id")
    fun GetById(Id: Long): RazaEntity?

    @Update
    fun Actualizar(raza: RazaEntity)

    @Delete
    fun Eliminar(raza: RazaEntity)

    @Query("SELECT * FROM ${RazaEntity.NOMBRE_TABLA} WHERE ${RazaEntity.COLM_ID}=:Id")
    fun EliminarById(Id: Long): Long
}