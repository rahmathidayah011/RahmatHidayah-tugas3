package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Perbaikan: Gunakan ViewBinding dengan benar
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol untuk pindah ke halaman Register
        binding.btnLogin2.setOnClickListener {
            val intent = Intent(this, RegisterActivity2::class.java)
            startActivity(intent)

            // Tombol Login -> Pindah ke DasboardActivity
            binding.btnLogin1.setOnClickListener {
                val intent = Intent(this, DasboardActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
