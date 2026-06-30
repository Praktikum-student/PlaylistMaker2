package com.practicum.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.btn_search)
        searchButton.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        val mediaButton = findViewById<Button>(R.id.btn_media)
        mediaButton.setOnClickListener {
            startActivity(Intent(this, MediaActivity::class.java))
        }

        val settingsButton = findViewById<Button>(R.id.btn_settings)
        settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}