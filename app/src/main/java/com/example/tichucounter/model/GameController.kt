package com.example.tichucounter.model

object GameController {
    var gameScore1: Int = 0
    var gameScore2: Int = 0
    var roundList: MutableList<Round> = mutableListOf()

    fun addRound(score1: Int, score2: Int): Boolean {
        if (!validateScore(score1, score2)) return false
        gameScore1 += score1; gameScore2 += score2
        roundList.add(Round(score1, score2))
        return true
    }

    fun validateScore(score1: Int, score2: Int): Boolean {
        // TODO: implement rules
        return true
    }
}