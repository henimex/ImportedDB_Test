package com.hendev.hazirveritaban

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.info.sqlitekullanimihazirveritabani.DatabaseCopyHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        copyDBtoDevice()
    }

    fun copyDBtoDevice() {
        val db = DatabaseCopyHelper(this)

        try {
            db.createDataBase()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        try {
            db.openDataBase()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}