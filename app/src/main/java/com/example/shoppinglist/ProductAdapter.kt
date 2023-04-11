package com.example.shoppinglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.databinding.DetailProductItemBinding

class ProductAdapter(
    private val products: List<Product>,
    private val onProductClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            DetailProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding).apply {
            this.itemView.setOnClickListener {
                product?.let(onProductClick::invoke)
            }
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.product = product
        with(holder.binding) {
            name.text = product.name
            price.text = "$${product.price}"
            image.setImageResource(product.image)
        }
    }

    class ViewHolder(val binding: DetailProductItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var product: Product? = null
    }
}
