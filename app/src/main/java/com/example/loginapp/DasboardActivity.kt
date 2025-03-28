package com.example.loginapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityDasboardBinding

class DasboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDasboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inisialisasi ViewBinding
        binding = ActivityDasboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
