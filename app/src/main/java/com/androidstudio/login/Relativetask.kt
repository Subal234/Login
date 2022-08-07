package com.androidstudio.login

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidstudio.login.databinding.ActivityRelativetaskBinding

class Relativetask : AppCompatActivity() {
    lateinit var binding: ActivityRelativetaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativetaskBinding.inflate(layoutInflater)

            setContentView(binding.root)
        supportActionBar?.hide()
    }
}