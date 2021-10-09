package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
//        bt = findViewById<Button>(R.id.btn_start)
            btn_start.setOnClickListener {
                if(et_name.text.toString().isEmpty()){
                    Toast.makeText(this, " please enter the name", Toast.LENGTH_LONG).show();

                }
                else{
                    val intent = Intent(this, QuizQuestionActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                    startActivity(intent)
                    finish()
                }
            }
    }
}