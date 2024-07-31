package com.skity.android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.skity.android.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.glExample.setOnClickListener {
            startActivity(Intent(this, GLRenderActivity::class.java))
        }
        binding.glSvgExample.setOnClickListener {
            startActivity(Intent(this, GLSVGRenderActivity::class.java))
        }
        binding.glFrameExample.setOnClickListener {
            startActivity(Intent(this, GLFrameActivity::class.java))
        }
        binding.vkSvgExample.setOnClickListener {
            startActivity(Intent(this, VkSVGActivity::class.java))
        }
        binding.vkFrameExample.setOnClickListener {
            startActivity(Intent(this, VkFrameActivity::class.java))
        }
    }
}