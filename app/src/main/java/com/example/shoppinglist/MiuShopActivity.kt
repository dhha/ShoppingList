package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.shoppinglist.databinding.ActivityCategoryDetailBinding
import com.example.shoppinglist.databinding.ActivityMiuShopBinding

class MiuShopActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMiuShopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMiuShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun clickCategory(view: View) {
        val intent = Intent(this, ShoppingList::class.java)
        when(view.id) {
            R.id.bookBtn -> {
                intent.putExtra("category", "book")
            }
            R.id.clotheBtn -> {
                intent.putExtra("category", "clothes")
            }
            R.id.foodBtn -> {
                intent.putExtra("category", "food")
            }
            R.id.medicineBtn -> {
                intent.putExtra("category", "medicine")
            }
        }

        startActivity(intent)
    }
}