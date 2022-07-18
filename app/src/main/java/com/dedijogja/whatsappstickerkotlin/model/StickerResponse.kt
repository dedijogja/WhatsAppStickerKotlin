package com.dedijogja.whatsappstickerkotlin.model

import com.google.gson.annotations.SerializedName

data class StickerResponse(
    @SerializedName("android_play_store_link")
    val androidPlayStoreLink: String,
    @SerializedName("ios_app_store_link")
    val iosAppStoreLink: String,
    @SerializedName("sticker_packs")
    val stickerPacks: List<StickerPackModel>
)