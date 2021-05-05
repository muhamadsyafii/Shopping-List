package com.syafii.shoppinglist.other

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syafii.shoppinglist.data.entities.ShoppingItem
import com.syafii.shoppinglist.databinding.ShoppingItemBinding
import com.syafii.shoppinglist.ui.shoppinglist.ShoppingViewModel
import kotlinx.android.synthetic.main.shopping_item.view.*

class ShoppingItemAdapter(
    var items: List<ShoppingItem>,
    private val viewModel: ShoppingViewModel
) : RecyclerView.Adapter<ShoppingItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ShoppingItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = items[position]

        holder.bindData(data)

        holder.itemView.ivDelete.setOnClickListener {
            viewModel.delete(data)
        }

        holder.itemView.ivPlus.setOnClickListener {
            data.amount++
            viewModel.upsert(data)
        }

        holder.itemView.ivMinus.setOnClickListener {
            if (data.amount > 0){
                data.amount--
                viewModel.upsert(data)
            }
        }
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(val binding : ShoppingItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(items: ShoppingItem){
            binding.tvName.text = items.name
            binding.tvAmount.text = "${items.amount}"
        }
    }
}