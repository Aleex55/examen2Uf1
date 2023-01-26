package com.example.examen2_uf1_alex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        var muebleLista =

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}