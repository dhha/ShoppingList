package com.example.shoppinglist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.databinding.ActivityProductDetailBinding

class ProductDetail : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val product = intent.getSerializableExtra("product") as Product
        title = product.name

        binding.productImage.setImageResource(product.image)
        binding.productName.text = product.name
        binding.productPrice.text = "Price: $${product.price}"
        binding.productKey.text = "Product Key: ${product.key}"
        binding.productItemId.text = "ProductId: #${product.id}"
    }
}