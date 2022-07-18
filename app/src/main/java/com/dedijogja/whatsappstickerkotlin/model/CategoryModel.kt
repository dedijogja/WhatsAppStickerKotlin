package com.dedijogja.whatsappstickerkotlin.model

import com.google.gson.annotations.SerializedName

data class CategoryModel(
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("category_name")
    val categoryName: String,
    @SerializedName("category_color")
    val categoryColor: String,
    @SerializedName("category_image")
    val categoryImage: String
    )