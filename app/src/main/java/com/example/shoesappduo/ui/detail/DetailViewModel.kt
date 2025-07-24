package com.example.shoesappduo.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoesappduo.data.model.Shoe

class DetailViewModel : ViewModel() {
    // LiveData internal untuk menampung data sepatu yang dipilih
    private val _selectedShoe = MutableLiveData<Shoe>()
    // LiveData eksternal yang akan diamati oleh Fragment
    val selectedShoe: LiveData<Shoe> get() = _selectedShoe

    // Fungsi untuk menetapkan data sepatu dari argumen Fragment
    fun setShoeData(shoe: Shoe) {
        _selectedShoe.value = shoe
    }
}