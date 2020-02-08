package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var scoreCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btnSubmit.setOnClickListener {
            calculateScore()
            showCorrectAnswers()
            scoreCount = 0
        }
    }

    private fun calculateScore(){
        val answer1 = answer1.text.toString()
        val answer2 = answer2.text.toString()
        val answer3 = answer3.text.toString()
        val answer4 = answer4.text.toString()

        if(answer1 == "T"){
            scoreCount++
        }
        if(answer2 == "F"){
            scoreCount++
        }
        if(answer3 == "F"){
            scoreCount++
        }
        if(answer4 == "F"){
            scoreCount++
        }
    }

    private fun showCorrectAnswers(){
        Toast.makeText(this, getString(R.string.correct) + " " + scoreCount, Toast.LENGTH_LONG).show()

    }
}
