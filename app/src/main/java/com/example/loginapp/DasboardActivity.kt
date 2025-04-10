package com.example.loginapp

import android.content.Intent
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

        // Dapatkan referensi ke tombol menggunakan ViewBinding
        binding.button.setOnClickListener {
            // Buat Intent untuk berpindah ke RecyclerViewActivity
            val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }
    }
}