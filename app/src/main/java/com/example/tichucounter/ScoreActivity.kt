package com.example.tichucounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.tichucounter.model.GameController

class ScoreActivity : AppCompatActivity() {
    private lateinit var field1: EditText
    private lateinit var field2: EditText
    private lateinit var gameScoreText1: TextView
    private lateinit var gameScoreText2: TextView
    private lateinit var okButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hides toolbar
        this.supportActionBar?.hide()

        setContentView(R.layout.activity_score)

        // Components initialization
        field1 = findViewById(R.id.pointsTeam1NumberField)
        field2 = findViewById(R.id.pointsTeam2NumberField)
        gameScoreText1 = findViewById(R.id.scoreTeam1TextView)
        gameScoreText2 = findViewById(R.id.scoreTeam2TextView)
        okButton = findViewById(R.id.okButton)
        okButton.setOnClickListener {
            val score1String = field1.text.toString()
            val score2String = field2.text.toString()
            if (score1String.isNotEmpty() && score2String.isNotEmpty()) {
                val score1 = score1String.toInt()
                val score2 = score2String.toInt()
                if (GameController.validateScore(score1, score2)) {
                    GameController.addRound(score1, score2)
                    updateActivity()
                } else Toast.makeText(it.context, "Score is not valid!", Toast.LENGTH_SHORT).show()
            } else Toast.makeText(it.context, "Add score in the fields first", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateActivity() {
        gameScoreText1.text = GameController.gameScore1.toString()
        gameScoreText2.text = GameController.gameScore2.toString()
        // TODO: Update list of rounds, when added
    }
}