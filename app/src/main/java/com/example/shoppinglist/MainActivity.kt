package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        title = "Main Screen";
    }

    fun viewProblem(view: View) {
        when(view.id) {
            R.id.prob1 -> {
                val intent = Intent(this, Quiz::class.java)
                startActivity(intent)
            }
            R.id.prob2 -> {
                val intent = Intent(this, Shopping::class.java)
                startActivity(intent)
            }
            R.id.prob3 -> {
                val intent = Intent(this, MiuShopActivity::class.java)
                startActivity(intent)
            }
        }
    }
}