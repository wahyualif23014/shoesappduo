package com.example.shoesappduo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoesappduo.data.datasource.DummyShoeDataSource
import com.example.shoesappduo.data.model.Shoe

class HomeViewModel : ViewModel() {

    private val _shoes = MutableLiveData<List<Shoe>>()
    val shoes: LiveData<List<Shoe>> get() = _shoes

    init {
        loadShoes()
    }

    private fun loadShoes() {
        _shoes.value = DummyShoeDataSource.getShoesData()
    }
}