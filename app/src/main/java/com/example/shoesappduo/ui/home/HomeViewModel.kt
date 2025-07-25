package com.example.shoesappduo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoesappduo.data.datasource.DummyShoeDataSource
import com.example.shoesappduo.data.model.Shoe

class HomeViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>()
    // shoes adalah LiveData eksternal yang hanya bisa dibaca (read-only) oleh Fragment
    val shoes: LiveData<List<Shoe>> get() = _shoes

    init {
        // Langsung muat data sepatu saat ViewModel ini pertama kali dibuat
        loadShoes()
    }

    private fun loadShoes() {
        // Mengambil data dari datasource dan mengirimkannya ke LiveData
        _shoes.value = DummyShoeDataSource.getShoesData()
    }
}