package com.example.examen2_uf1_alex.databases

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.examen2_uf1_alex.model.Mueble

@Dao
interface MuebleDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addMueble(mueble: Mueble)

    @Query("SELECT * FROM furniture ORDER BY price DESC")
    fun getMuebles(): LiveData<List<Mueble>>

    @Update
    suspend fun updateMueble(mueble: Mueble)

    @Delete
    suspend fun deleteMueble (mueble: Mueble)
}
