package com.example.tichucounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hides toolbar
        this.supportActionBar?.hide()

        setContentView(R.layout.activity_score)
    }
}