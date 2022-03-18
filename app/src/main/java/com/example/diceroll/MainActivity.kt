package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.diceroll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.tvNumber.text = viewModel.num.toString()

       binding.btnRoll.setOnClickListener {
           binding.tvNumber.text = viewModel.num.toString()
           binding.tvNumber.text = viewModel.rollDice(6).toString()

       }
    }

}

