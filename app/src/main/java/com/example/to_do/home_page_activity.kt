package com.example.to_do

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast




class home_page_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


         val login_page: Button = findViewById(R.id.login_page)
        login_page.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            val language_button: Button = findViewById(R.id.language_button)
            language_button.setOnClickListener {
                val intent = Intent(this, LanguageActivity::class.java)
                startActivity(intent)
            }

        }

    }
}