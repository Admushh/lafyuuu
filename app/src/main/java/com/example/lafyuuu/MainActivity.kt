package com.example.lafyuuu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Add OnClickListener for ImageView to navigate to FavoriteActivity
        val imageView: ImageView = findViewById(R.id.IVFavourite)
        imageView.setOnClickListener {

            val recyclerView = findViewById<RecyclerView>(R.id.rvFlashSale)
            recyclerView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        }
    }
}






