package com.keegan.android.itc362hw1ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var clickButton: Button
    private lateinit var text : TextView
    private lateinit var helloImage: ImageView
    private lateinit var goodByeImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickButton = findViewById(R.id.imageSwitchButton)
        text = findViewById(R.id.helloGoodByeText)
        helloImage = findViewById(R.id.helloImage)
        goodByeImage = findViewById(R.id.goodbyeImage)

        clickButton.setOnClickListener{
            val helloText = resources.getString(R.string.hello)
            val goodByeText = resources.getString(R.string.goodbye)
            if(text.text.equals(helloText))
            {
                text.setText(goodByeText)
                helloImage.setVisibility(View.INVISIBLE)
                goodByeImage.setVisibility(View.VISIBLE)
            }
            else{
                text.setText(helloText)
                helloImage.setVisibility(View.VISIBLE)
                goodByeImage.setVisibility(View.INVISIBLE)
            }
        }
    }
}