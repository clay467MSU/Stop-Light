package com.gall.msu.stoplight

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.gall.msu.stoplight.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
    private lateinit var binding : ActivityMainBinding
//    private lateinit var imageView: ImageView
//    private lateinit var button: Button
    private var status = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

//        imageView = findViewById(R.id.imageView)
//        button = findViewById(R.id.button)

        binding.imageView.setImageResource(R.drawable.lakitu_red)

        binding.button.setOnClickListener{
            status = (status + 1) % 3
            updateDisplay()
        }
    }

    private fun updateDisplay() {
        when (status) {
            0 -> {binding.imageView.setImageResource(R.drawable.lakitu_red)
                  binding.button.text = "Stop"
                 }
            1 -> {binding.imageView.setImageResource(R.drawable.lakitu_yellow)
                  binding.button.text = "Wait"
                 }
            2 -> {binding.imageView.setImageResource(R.drawable.lakitu_green)
                  binding.button.text = "Go"
                 }
        }
    }
}