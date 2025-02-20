package com.example.monresto.model

import androidx.annotation.DrawableRes

data class Article(
    val name: String,
    @DrawableRes val image: Int
)
