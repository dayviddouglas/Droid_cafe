package com.example.droid_cafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageId = intent.getIntExtra(MainActivity.KEY_IMAGE,R.drawable.ic_launcher_background)
        val imageName = intent.getStringExtra(MainActivity.KEY_IMAGE_NAME).orEmpty()
         val ivImage = findViewById<ImageView>(R.id.imageView2)
         val tvImageName:TextView = findViewById(R.id.textView)
          ivImage.setImageResource(imageId)
          tvImageName.text = imageName
    }
}