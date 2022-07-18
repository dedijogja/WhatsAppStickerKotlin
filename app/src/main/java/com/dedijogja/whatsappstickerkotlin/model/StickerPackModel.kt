package com.dedijogja.whatsappstickerkotlin.model

data class StickerPackModel(
    val identifier: String,
    val name: String,
    val publisher: String,
    val trayImageFile: String,
    val imageDataVersion: String,
    val avoidCache: Boolean,
    val publisherEmail: String,
    val publisherWebsite: String,
    val privacyPolicyWebsite: String,
    val licenseAgreementWebsite: String,
    var stickers: List<StickerModel>,
    val animatedStickerPack: Boolean,
    var androidPlayStoreLink: String = "",
    var iosAppStoreLink: String = "",
    var categoryId: Int,
    val lastUpdate: String,
    val stickerSize: String,
    var isLock: Boolean = false

)