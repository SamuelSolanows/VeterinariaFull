package com.example.veterinariafull.DB.Iterfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.IGNORE
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import com.example.veterinariafull.DB.Entitys.MascotaEntity

@Dao
interface IMascota {
    @Insert(onConflict = IGNORE)
    fun Inseratr(Mascota: MascotaEntity): Long

    @Query("SELECT * FROM ${MascotaEntity.NOMBRE_TABLA}")
    fun GetAll(): List<MascotaEntity>

    @Query("SELECT * FROM ${MascotaEntity.NOMBRE_TABLA} WHERE ${MascotaEntity.COLM_ID} = :Id")
    fun GetById(Id: Long): MascotaEntity?

    @Update(onConflict = IGNORE)
    fun Actualizar(Mascota: MascotaEntity): Long

    @Delete
    fun Eliminar(Mascota: MascotaEntity): Long

    @Query("SELECT * FROM ${MascotaEntity.NOMBRE_TABLA} WHERE ${MascotaEntity.COLM_ID} = :Id")
    fun EliminarById(Id: Long): Long


}