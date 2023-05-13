package com.example.droid_cafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    @DrawableRes
    private var imageId: Int = 0
    private var imagename : String = ""

    companion object {
        const val KEY_IMAGE ="KEY_IMAGE"
        const val KEY_IMAGE_NAME ="KEY_IMAGE_NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageDonut:ImageView = findViewById(R.id.donutImage)
        val imageIcecream:ImageView = findViewById(R.id.icecreamImage)
        val imageFroyo: ImageView = findViewById(R.id.froyoImage)
        val actionButton: FloatingActionButton = findViewById(R.id.floatingActionButton)

        imageDonut.setOnClickListener {
            Toast.makeText(this,"Donut",Toast.LENGTH_LONG).show()
            imageId = R.drawable.donut_circle
            imagename = getString(R.string.text_donut)
        }
        imageIcecream.setOnClickListener {
            Toast.makeText(this, "Icecream",Toast.LENGTH_LONG).show()
            imageId = R.drawable.icecream_circle
            imagename = getString(R.string.text_icecream)
        }
        imageFroyo.setOnClickListener {
            Toast.makeText(this, "Froyo", Toast.LENGTH_LONG).show()
            imageId = R.drawable.froyo_circle
            imagename = getString(R.string.text_froyo)
        }


        actionButton.setOnClickListener {
            val openScreenIntent = Intent(this,SecondActivity::class.java)
            openScreenIntent.putExtra(KEY_IMAGE,imageId)
            openScreenIntent.putExtra(KEY_IMAGE_NAME,imagename)
            startActivity(openScreenIntent)
        }
    }
}