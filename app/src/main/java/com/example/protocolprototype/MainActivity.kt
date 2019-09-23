package com.example.protocolprototype

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.util.Log.d

import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        newProtocol.setOnClickListener {
            d("Guava", "New Protocol button was pressed.")
            startActivity(Intent(this, Protocol::class.java))
        }
        statistics.setOnClickListener {
            d("Guava", "Statistics button was pressed.")
        }
    }
}
