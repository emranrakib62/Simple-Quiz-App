package com.example.simple_quiz_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private val quizlist= listOf<Quiz>(
        Quiz("What is the capital of BD?","Dhaka","Noakhali","Chittagong","Bogura","Dhaka"),
        Quiz("What is the Victory Day of Bangladesh?","16 May","19  Auguest","16 December","26 March","16 December"),
        Quiz("What is the Independence Day of Bangladesh?","16 May","19  Auguest","16 December","26 March","26 March"),
        Quiz("What is the Currency of Bd?","Taka","Rupi","Doller","yeyen","Taka"),
        Quiz("What is the national stadium Location of Bd?","Dhaka","Noakhali","Chittagong","Bogura","Dhaka"),





    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

    }
}