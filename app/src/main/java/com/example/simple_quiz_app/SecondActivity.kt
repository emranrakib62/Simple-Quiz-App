package com.example.simple_quiz_app

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.simple_quiz_app.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val quizlist= listOf<Quiz>(
        Quiz("What is the capital of BD?","Dhaka","Noakhali","Chittagong","Bogura","Dhaka"),
        Quiz("What is the Victory Day of Bangladesh?","16 May","19  Auguest","16 December","26 March","16 December"),
        Quiz("What is the Independence Day of Bangladesh?","16 May","19  Auguest","16 December","26 March","26 March"),
        Quiz("What is the Currency of Bd?","Taka","Rupi","Doller","yeyen","Taka"),
        Quiz("What is the national stadium Location of Bd?","Dhaka","Noakhali","Chittagong","Bogura","Dhaka"),





    )
    var quizIndex=0
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {


            if(quizIndex<quizlist.size){

                setQuiz(quizIndex)
                quizIndex++
            }else{
                Toast.makeText(this,"No Question Available",Toast.LENGTH_SHORT).show()
            }
        }


    }
    private  fun setQuiz(auizIndex:Int){
var quiz:Quiz=quizlist.get(quizIndex)
binding.questionTv.text=quiz.Question
        binding.option1.text=quiz.Question
        binding.option2.text=quiz.Question
        binding.option3.text=quiz.Question
        binding.option4.text=quiz.Question


    }

}