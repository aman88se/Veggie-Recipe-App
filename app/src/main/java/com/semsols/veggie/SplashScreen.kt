package com.semsols.veggie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startBtn.setOnClickListener{

            startActivity(Intent(this@SplashScreen,HomeScreen::class.java))
            finish()

        }
    }
}