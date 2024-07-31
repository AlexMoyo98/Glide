package com.example.glide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.glide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.populateButton.setOnClickListener {

            val url = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTC4OQH6jioDwV4tdW_EBOKjX_P63k1ekMWKXPHNyEQBmetkEDq"
            val imagePath = binding.imageView
            Glide.with(this)
                .load(url)
                .into(imagePath)
        }
    }
}