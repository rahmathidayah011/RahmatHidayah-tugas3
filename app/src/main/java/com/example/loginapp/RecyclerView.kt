package com.example.loginapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Dapatkan referensi ke RecyclerView dari layout
        val recyclerViewLagu = findViewById<RecyclerView>(R.id.recyclerViewLagu)

        // Buat LayoutManager
        recyclerViewLagu.layoutManager = LinearLayoutManager(this)

        // Contoh data lagu dengan gambar
        val daftarLagu = listOf(
            Lagu("Asal Kau Bahagia", "Armada", R.drawable.asal), // Ganti dengan nama gambar Queen
            Lagu("Awas Jatuh Cinta", "Armada", R.drawable.awas), // Ganti dengan nama gambar Led Zeppelin
            Lagu("Apa Kabar Sayang", "Armada", R.drawable.apa), // Ganti dengan nama gambar Eagles", "Eagles", R.drawable. bob), // Ganti dengan nama gambar Eagles
            Lagu("Nyong Timur", "Gihon Marel", R.drawable.nyong),
            Lagu("Luka Baru", "Gihon Marel", R.drawable.luka), // Ganti dengan nama gambar Queen
            Lagu("Rumah Singgah", "Fabio Asher",  R.drawable.rumah), // Ganti dengan nama gambar Led Zeppelin
            Lagu("Pagi Pulang Pagi", "Armada", R.drawable.pagi), // Ganti dengan nama gambar Eagles
            Lagu("Elegi Esok Pagi", "Ebiet G.Ade", R.drawable.esok),
            Lagu("Masih Ada Waktu", "Andera", R.drawable.masih), // Ganti dengan nama gambar Queen
            Lagu("Hanya Rindu", "Andmesh", R.drawable.hanya), // Ganti dengan nama gambar Led Zeppelin
            Lagu("Ibu", "Iwan Fals ", R.drawable.ibu), // Ganti dengan nama gambar Eagles
            Lagu("Manusia Kuat", "Tulus", R.drawable.manusia),
            Lagu("Ayah", "Seventeen", R.drawable.ayah), // Ganti dengan nama gambar Queen
            Lagu("Duka", "Last Child", R.drawable.duka), // Ganti dengan nama gambar Led Zeppelin
            Lagu("Kukira Kau Rumah", "Amigdala", R.drawable.kukira), // Ganti dengan nama gambar Eagles
            Lagu("Lumpuhkanlah Ingatanku", "Geidha", R.drawable.lumpuh)// Ganti dengan nama gambar Bob Dylan// Ganti dengan nama gambar Bob Dylan

        )

        // Buat Adapter dengan data
        val adapter = MyAdapter(daftarLagu)

        // Setel Adapter ke RecyclerView
        recyclerViewLagu.adapter = adapter
    }
}