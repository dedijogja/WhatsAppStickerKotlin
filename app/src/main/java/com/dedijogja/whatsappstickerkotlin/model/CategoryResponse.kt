package com.dedijogja.whatsappstickerkotlin.model

import com.google.gson.annotations.SerializedName

data class CategoryResponse (
    @SerializedName("category")
    val listCategoryModel: List<CategoryModel>
)