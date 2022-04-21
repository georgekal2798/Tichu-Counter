package com.example.tichucounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hides toolbar
        this.supportActionBar?.hide()

        setContentView(R.layout.activity_menu)
    }

    // Triggered by the onClick attribute of newGameButton
    fun newGame(view: View) {
        val intent = Intent(this, ScoreActivity::class.java)
        startActivity(intent)
    }
}