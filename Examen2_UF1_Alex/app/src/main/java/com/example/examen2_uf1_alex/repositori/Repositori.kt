package com.example.examen2_uf1_alex.repositori

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.examen2_uf1_alex.databases.MuebleDatabase
import com.example.examen2_uf1_alex.model.Mueble
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class Repositori {
    companion object{
        var muebleDatabase: MuebleDatabase? = null

        var mueble: LiveData<List<Mueble>>? = null

        fun initializeDB(context: Context): MuebleDatabase{
            return MuebleDatabase.getDatabase(context)
        }

        //INSERT mueble
        fun insertMueble (context: Context, mueble: Mueble){
            muebleDatabase = initializeDB(context)

            CoroutineScope(IO).launch{
                muebleDatabase!!.muebleDao().addMueble(mueble)
            }
        }
        //SQL muebles
        fun getMuebles (context: Context): LiveData<List<Mueble>>?{
            muebleDatabase = initializeDB(context)

            CoroutineScope(IO).launch {
                mueble = muebleDatabase!!.muebleDao().getMuebles()
            }
            return mueble
        }
        //UPDATE mueble
        fun updateMueble (context: Context, mueble: Mueble){
            muebleDatabase = initializeDB(context)

            CoroutineScope(IO).launch{
                muebleDatabase!!.muebleDao().updateMueble(mueble)
            }
        }
        //UPDATE mueble
        fun deleteMueble (context: Context, mueble: Mueble){
            muebleDatabase = initializeDB(context)

            CoroutineScope(IO).launch{
                muebleDatabase!!.muebleDao().deleteMueble(mueble)
            }
        }
    }
}