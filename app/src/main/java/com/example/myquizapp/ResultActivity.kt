package com.example.myquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvCongradulation:TextView = findViewById(R.id.tvCongradulation)
        val tvName : TextView = findViewById(R.id.tvNickname)
        val tvResult :TextView = findViewById(R.id.tvResult)
        val btnFinish: Button = findViewById(R.id.btnFinish)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctQuestion = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)


        tvResult.text = "Ваш результат $correctQuestion из $totalQuestions"
        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        if(correctQuestion < 7) {
            tvCongradulation.text = "Вы посмотрели достаточно аниме"
        }
        if(correctQuestion < 4)
            tvCongradulation.text = "Вы нубик"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}