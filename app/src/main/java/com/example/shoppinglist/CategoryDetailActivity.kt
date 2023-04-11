package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.shoppinglist.databinding.ActivityCategoryDetailBinding

class CategoryDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryDetailBinding
    private  lateinit var arrData: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Category Detail"

        val intent = intent
        val dataIntent = intent.getStringExtra("category")
        var arrData: Array<String>

        when(dataIntent) {
            "book" -> {
                arrData = resources.getStringArray(R.array.books)
            }
            "clothes" -> {
                arrData = resources.getStringArray(R.array.clothes)
            }
            "food" -> {
                arrData = resources.getStringArray(R.array.food)
            }
            "medicine" -> {
                arrData = resources.getStringArray(R.array.medicine)
            }
            else -> {
                arrData = emptyArray()
            }
        }

        if(!arrData.isEmpty()) {
            with(binding) {
                name.text = arrData.get(0).toString()
                author.text = arrData[1].toString()
                description.text = arrData[2].toString()
                type.text = arrData[3].toString()
                category.text = arrData[4].toString()
                otherAuthor.text = arrData[5].toString()
                status.text = arrData[6].toString()
            }
        }

    }

    fun viewText(view: View) {
        val comp = view as TextView
        Toast.makeText(this, comp.text, Toast.LENGTH_LONG).show()
    }
}