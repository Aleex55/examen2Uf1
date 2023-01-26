package com.example.examen2_uf1_alex.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.examen2_uf1_alex.model.Mueble
import com.example.examen2_uf1_alex.repositori.Repositori

class MuebleViewModel : ViewModel() {
    var mueble: LiveData<List<Mueble>>? = null

    //INSERT meuble
    fun newMueble (context: Context, nombre:String, precio:Int){

        var muebleVM = Mueble(nombre, precio)
        Repositori.insertMueble(context, muebleVM)
    }

    //UPDATE mueble
    fun udtMueble (context: Context, nombre: String, precio: Int){
        var muebleVM = Mueble(nombre, precio)
        Repositori.updateMueble(context,muebleVM)
    }
    //DELETE mueble
    fun dltMueble (context: Context, nombre: String, precio: Int){
        var muebleVM = Mueble(nombre, precio)
        Repositori.deleteMueble(context,muebleVM)
    }

    //SQL muebles
    fun obtenirMuebles(context: Context) : LiveData<List<Mueble>>?{
        mueble = Repositori.getMuebles(context)
        return mueble
    }
}