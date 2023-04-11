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
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrData)
            binding.listView.adapter = adapter
        }

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, arrData.get(i).toString(), Toast.LENGTH_SHORT).show()
        }
    }

    fun viewText(view: View) {
        val comp = view as TextView
        Toast.makeText(this, comp.text, Toast.LENGTH_LONG).show()
    }
}