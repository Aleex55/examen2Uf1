package com.example.examen2_uf1_alex.databases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.examen2_uf1_alex.model.Mueble


@Database(
entities = [Mueble::class],
    version = 1,
    exportSchema = false
)

abstract class MuebleDatabase : RoomDatabase() {
    abstract fun muebleDao() : MuebleDao

    companion object{

        @Volatile
        private var INSTANCE: MuebleDatabase? = null

        fun getDatabase (context: Context): MuebleDatabase{
            if (INSTANCE == null){
                synchronized(this){
                    INSTANCE = buildDatabase(context)
                }
            }
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): MuebleDatabase{
            return Room.databaseBuilder(
                context.applicationContext,
                MuebleDatabase::class.java,
                "mueble_database"
            ).build()
        }
    }
}