package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    // Menampilkan menu di pojok kanan atas
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Menangani klik pada menu item
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                // Pindah ke halaman profil
                startActivity(Intent(this, ProfileActivity::class.java))
                true
            }

            R.id.logout -> {
                // Kembali ke halaman login
                startActivity(Intent(this, MainActivity::class.java))
                finish()
                true
            }

            R.id.about -> {
                // Pindah ke halaman about
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
