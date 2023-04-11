package com.example.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist.databinding.ActivityShoppingListBinding

class ShoppingList : AppCompatActivity() {
    private lateinit var binding: ActivityShoppingListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val category = intent.getStringExtra("category")
        title = "Miu $category products list"

        var products = productGen(category.toString())


        val adapter = products?.let {
            ProductAdapter(it, onProductClick = { product ->
                val intent = Intent(this, ProductDetail::class.java)
                intent.putExtra("product", product)
                startActivity(intent)
            })
        }
        binding.Rview.layoutManager = LinearLayoutManager(this)

        binding.Rview.adapter = adapter
    }

    private fun productGen(category: String = "book") : ArrayList<Product> {
        var products = ArrayList<Product>();

        products.add(Product(
            1,
            "THE COHERENCE EFFECT BOOK",
            19.12,
            "Improve health & higher brain functioning.\n" +
                "The product of years of research and practice by a powerhouse team of authors, The Coherence Effect illustrates how you can enhance your naturally coherent state for lifelong health even in a stressful world.",
            R.drawable.coherence_effect_1200x
        ))

        products.add(Product(
            2,
            "HEALTHY BRAIN BOOK",
            23.12,
            "Stay sharp, energized & youthful.\n" +
                "Women over 40: Learn how to promote memory, feel great, and look younger than you really are--with or without hormones. Explore the latest in scientific research and evidence-based Ayurveda with Nancy's Lonsdorf, MD, one of the nation's most prominent Ayurveda doctors.",
            R.drawable.book2
        ))

        products.add(Product(
            1,
            "THE COHERENCE EFFECT BOOK",
            19.12,
            "Improve health & higher brain functioning.\n" +
                    "The product of years of research and practice by a powerhouse team of authors, The Coherence Effect illustrates how you can enhance your naturally coherent state for lifelong health even in a stressful world.",
            R.drawable.coherence_effect_1200x
        ))

        products.add(Product(
            2,
            "HEALTHY BRAIN BOOK",
            23.12,
            "Stay sharp, energized & youthful.\n" +
                    "Women over 40: Learn how to promote memory, feel great, and look younger than you really are--with or without hormones. Explore the latest in scientific research and evidence-based Ayurveda with Nancy's Lonsdorf, MD, one of the nation's most prominent Ayurveda doctors.",
            R.drawable.book2
        ))

        return products;
    }
}