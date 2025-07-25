package com.example.shoesappduo.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.shoesappduo.R
import com.example.shoesappduo.data.model.Shoe
import com.example.shoesappduo.databinding.ItemRowShoeBinding

class ShoeAdapter(
    private val onItemClick: (Shoe) -> Unit
) : ListAdapter<Shoe, ShoeAdapter.ShoeViewHolder>(ShoeDiffCallback()) {

    inner class ShoeViewHolder(private val binding: ItemRowShoeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(shoe: Shoe) {
            binding.tvItemName.text = shoe.name
//            binding.tvItemBrand.text = shoe.brand
            binding.tvItemPrice.text = shoe.price

            binding.imgItemPhoto.load(shoe.photoUrl) {
                crossfade(true)
                placeholder(R.drawable.ic_placeholder)
                error(R.drawable.ic_error)
            }

            itemView.setOnClickListener {
                onItemClick(shoe)
            }
        }
    }

    // onCreateViewHolder tidak berubah
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val binding = ItemRowShoeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShoeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        val shoe = getItem(position)
        holder.bind(shoe)
    }
}

// Kelas untuk membandingkan list lama dan baru secara efisien
class ShoeDiffCallback : DiffUtil.ItemCallback<Shoe>() {
    override fun areItemsTheSame(oldItem: Shoe, newItem: Shoe): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Shoe, newItem: Shoe): Boolean {
        return oldItem == newItem
    }
}