package com.example.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val music = intent.getParcelableExtra<Music>("music")
        if (music != null){
            val textView : TextView = findViewById(R.id.text_album)
            val imageView : ImageView = findViewById(R.id.image_album)

            textView.text = music.name
            imageView.setImageResource((music.image))


        }
    }
}