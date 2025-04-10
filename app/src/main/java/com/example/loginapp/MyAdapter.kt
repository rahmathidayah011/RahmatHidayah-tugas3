package com.example.loginapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val daftarLagu: List<Lagu>) : RecyclerView.Adapter<MyAdapter.LaguViewHolder>() {

    class LaguViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambarLaguImageView: ImageView = itemView.findViewById(R.id.gambarLaguImageView)
        val judulLaguTextView: TextView = itemView.findViewById(R.id.judulLaguTextView)
        val penyanyiLaguTextView: TextView = itemView.findViewById(R.id.penyanyiLaguTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaguViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_item_data, parent, false)
        return LaguViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LaguViewHolder, position: Int) {
        val lagu = daftarLagu[position]
        holder.judulLaguTextView.text = lagu.judul
        holder.penyanyiLaguTextView.text = lagu.penyanyi
        holder.gambarLaguImageView.setImageResource(lagu.gambarResId) // Set gambar di sini
    }

    override fun getItemCount(): Int {
        return daftarLagu.size
    }
}