package com.example.practical_exam

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var btnWebsite: Button
    private lateinit var btnAnimate: Button
    private lateinit var btnSnackbar: Button
    private lateinit var imageView: ImageView
    private lateinit var animationDrawable: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Views
        btnWebsite = findViewById(R.id.btnOpenWebsite)
        btnAnimate = findViewById(R.id.btnAnimate)
        btnSnackbar = findViewById(R.id.btnSnackbar)
        imageView = findViewById(R.id.imageView)

        // AnimationDrawable setup
        animationDrawable = imageView.background as AnimationDrawable

        // BUTTON 1: Open Ganpat University Website
        btnWebsite.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ganpatuniversity.ac.in"))
            startActivity(intent)
        }

        // BUTTON 2: Start Frame Animation
        btnAnimate.setOnClickListener {
            if (!animationDrawable.isRunning) {
                animationDrawable.start()
            }
        }

        // BUTTON 3: Show Snackbar
        btnSnackbar.setOnClickListener {
            Snackbar.make(it, "HELLO HOW ARE YOU?", Snackbar.LENGTH_LONG).show()
        }
    }
}
