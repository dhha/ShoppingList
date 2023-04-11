package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.shoppinglist.databinding.ActivityShoppingBinding

class Shopping : AppCompatActivity() {
    private lateinit var binding: ActivityShoppingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Shopping"
    }

    fun clickCategory(view: View) {
        val intent = Intent(this, CategoryDetailActivity::class.java)
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