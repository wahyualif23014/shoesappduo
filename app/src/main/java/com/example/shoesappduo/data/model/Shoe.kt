package com.example.shoesappduo.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Shoe(
    val id: Int,
    val name: String,
    val brand: String,
    val price: String,
    val description: String,
    val photoUrl: String
) : Parcelable

