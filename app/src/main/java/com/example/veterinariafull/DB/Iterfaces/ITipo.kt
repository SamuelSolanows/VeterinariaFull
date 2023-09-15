package com.example.veterinariafull.DB.Iterfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.veterinariafull.DB.Entitys.TipoEntity

@Dao
interface ITipo {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun Insertar(tipo: TipoEntity): Long

    @Query("SELECT * FROM ${TipoEntity.NOMBRE_TABLA}")
    fun GetAll(): List<TipoEntity>

    @Query("SELECT * FROM ${TipoEntity.NOMBRE_TABLA} WHERE ${TipoEntity.COLM_ID}=:Id")
    fun GetById(Id: Long): TipoEntity?

    @Update
    fun Actualizar(tipo: TipoEntity)

    @Delete
    fun Eliminar(tipo: TipoEntity)

    @Query("SELECT * FROM ${TipoEntity.NOMBRE_TABLA} WHERE ${TipoEntity.COLM_ID}=:Id")
    fun EliminarById(Id: Long): Long
}