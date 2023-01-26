package com.example.examen2_uf1_alex.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "furniture")
data class Mueble (
    @ColumnInfo(name = "name")
    var nombre: String,
    @ColumnInfo(name = "price")
    var precio: Int
    ){
    @PrimaryKey(autoGenerate = true)
    var Id: Int? = null
}