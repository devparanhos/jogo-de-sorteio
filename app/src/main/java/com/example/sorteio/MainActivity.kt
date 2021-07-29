package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun randomNumber(view:View){
        var randomText = findViewById(R.id.randomText) as TextView
        var number = java.util.Random().nextInt(11)
        randomText.setText("O número sorteado é: $number ")
    }
}