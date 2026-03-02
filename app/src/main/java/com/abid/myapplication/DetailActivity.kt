package com.abid.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageViewProfile= findViewById<ImageView>(R.id.imageProfile)
        val textViewName= findViewById<TextView>(R.id.textViewName)

        textViewName.text = "Harry Potter"
        val url = "https://raw.githubusercontent.com/fedeperin/potterapi/main/public/images/characters/harry_potter.png"

        Glide.with(imageViewProfile)
            .load(url)
            .into(imageViewProfile)


    }
}