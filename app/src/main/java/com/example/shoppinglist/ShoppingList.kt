package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppinglist.databinding.ActivityShoppingListBinding

class ShoppingList : AppCompatActivity() {
    private lateinit var binding: ActivityShoppingListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Miu products list"

    }
}