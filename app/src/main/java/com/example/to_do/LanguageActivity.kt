package com.example.to_do

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        val animal_button: Button= findViewById(R.id.animal_button)
        animal_button.setOnClickListener {
            val intent= Intent(this, Animals_Activity::class.java)
            startActivity(intent)
        }
    }
}