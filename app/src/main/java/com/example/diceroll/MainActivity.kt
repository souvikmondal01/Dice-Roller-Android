package com.example.diceroll

import android.animation.Animator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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
           binding.lavDice.visibility = View.VISIBLE
           binding.tvNumber.visibility = View.INVISIBLE
           binding.lavDice.playAnimation()
           binding.tvNumber.text = viewModel.num.toString()
           binding.tvNumber.text = viewModel.rollDice(6).toString()

           binding.lavDice.addAnimatorListener(object : Animator.AnimatorListener {
               override fun onAnimationStart(animator: Animator) {
                   binding.lavDice.visibility = View.VISIBLE
                   binding.tvNumber.visibility = View.INVISIBLE
               }

               override fun onAnimationEnd(animator: Animator) {
                   binding.lavDice.visibility = View.GONE
                   binding.tvNumber.visibility = View.VISIBLE
               }

               override fun onAnimationCancel(animator: Animator) {}
               override fun onAnimationRepeat(animator: Animator) {}
           })


       }




    }

}


