package com.dedijogja.whatsappstickerkotlin.model

import com.google.gson.annotations.SerializedName

data class StickerModel(
    @SerializedName("image_file")
    val imageFile: String,
    @SerializedName("emojis")
    val emojis: List<String>,
    var size: Int = 0
)



