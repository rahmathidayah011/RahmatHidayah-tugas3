package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityRegister2Binding

class RegisterActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol untuk pindah ke halaman MainActivity (Login)
        binding.btnLogin3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
