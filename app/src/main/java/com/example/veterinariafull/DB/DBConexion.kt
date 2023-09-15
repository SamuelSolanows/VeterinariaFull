package com.example.veterinariafull.DB


import android.content.ContentValues
import android.content.Context
import androidx.room.OnConflictStrategy
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.veterinariafull.Adapter.RazaAdapter
import com.example.veterinariafull.DB.Entitys.MascotaEntity
import com.example.veterinariafull.DB.Entitys.RazaEntity
import com.example.veterinariafull.DB.Entitys.TipoEntity
import com.example.veterinariafull.DB.Entitys.VacunaEntity
import com.example.veterinariafull.DB.Iterfaces.IMascota
import com.example.veterinariafull.DB.Iterfaces.IRaza
import com.example.veterinariafull.DB.Iterfaces.ITipo
import com.example.veterinariafull.DB.Iterfaces.IVacuna
import com.example.veterinariafull.Mascota

abstract class DBConexion() : RoomDatabase() {
    abstract fun RazaDao(): IRaza
    abstract fun TipoDao(): ITipo
    abstract fun VacunaDao(): IVacuna
    abstract fun MascotaDao(): IMascota

    companion

    object {
        private var INSTA: DBConexion? = null
        fun Getdatabase(context: Context): DBConexion {
            if (INSTA != null) {
                return INSTA!!
            }
            INSTA = Room.databaseBuilder(context.applicationContext, DBConexion::class.java, "db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        var list = listOf(
                            TipoEntity(0, "Gato"),
                            TipoEntity(0, "Perro")
                        )
                        list.forEach { tipo ->
                            db.insert(TipoEntity.NOMBRE_TABLA, OnConflictStrategy.ABORT,
                                ContentValues().apply {
                                    put(TipoEntity.COLM_NOMBRE, tipo.Nombre)

                                }
                            )
                        }
                    }
                }).build()
            return INSTA!!

        }
    }

}