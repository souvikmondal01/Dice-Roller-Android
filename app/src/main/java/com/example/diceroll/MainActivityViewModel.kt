package com.example.diceroll

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var num = 0
    fun rollDice(n: Int):Int{
        num = (1..n).random()
        return num
    }

}

