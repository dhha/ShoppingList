package com.example.shoppinglist

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.databinding.ActivityQuizBinding
import java.text.DateFormat
import java.util.*

class Quiz : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Quiz"
        val currentTime: Date = Calendar.getInstance().getTime()

        binding.submit.setOnClickListener {
            var score = 0
            //Check radio
            if(binding.rb1.isChecked)
                score += 50
            //Check checkbox
            if(binding.checkbox1.isChecked && binding.checkbox2.isChecked && !binding.checkbox3.isChecked)
                score += 50

            val dateFormated = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(currentTime)
            AlertDialog.Builder(this)
                .setPositiveButton("Ok") { _, _ -> }
                .setMessage("Congratulations! You submitted on current ${dateFormated.toString()}, Your achieved $score%").show()

        }

        binding.reset.setOnClickListener {
            binding.rg.clearCheck()
            with(binding) {
                checkbox1.isChecked = false
                checkbox2.isChecked = false
                checkbox3.isChecked = false
            }
        }
    }
}