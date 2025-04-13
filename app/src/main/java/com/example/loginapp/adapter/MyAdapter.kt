package com.example.loginapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginapp.R
import com.example.loginapp.model.Item

class MyAdapter(
    private val daftarLagu: List<Item>,
    private val onItemClick: (Item) -> Unit
) : RecyclerView.Adapter<MyAdapter.LaguViewHolder>() {

    class LaguViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.imageView)
        val judul: TextView = itemView.findViewById(R.id.textTitle)
        val penyanyi: TextView = itemView.findViewById(R.id.textDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaguViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return LaguViewHolder(view)
    }

    override fun onBindViewHolder(holder: LaguViewHolder, position: Int) {
        val item = daftarLagu[position]
        holder.gambar.setImageResource(item.imageSource)
        holder.judul.text = item.imageTitle
        holder.penyanyi.text = item.imageDesc

        holder.itemView.setOnClickListener {
            onItemClick(item)
        }
    }

    override fun getItemCount(): Int = daftarLagu.size
}
