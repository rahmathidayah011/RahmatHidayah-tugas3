package com.example.loginapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityItemDataBinding
import com.example.loginapp.model.Item

class ItemData : AppCompatActivity() {

    private lateinit var binding: ActivityItemDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getParcelableExtra<Item>("item")

        item?.let {
            binding.detailImage.setImageResource(it.imageSource)
            binding.detailTitle.text = it.imageTitle
            binding.detailDesc.text = it.imageDesc
        }
    }
}
