package com.dedijogja.whatsappstickerkotlin.model

import com.google.gson.annotations.SerializedName

data class StickerPackModel(
    @SerializedName("identifier")
    val identifier: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("publisher")
    val publisher: String,
    @SerializedName("tray_image_file")
    val trayImageFile: String,
    @SerializedName("image_data_version")
    val imageDataVersion: String,
    @SerializedName("avoid_cache")
    val avoidCache: Boolean,
    @SerializedName("publisher_email")
    val publisherEmail: String,
    @SerializedName("publisher_website")
    val publisherWebsite: String,
    @SerializedName("privacy_policy_website")
    val privacyPolicyWebsite: String,
    @SerializedName("license_agreement_website")
    val licenseAgreementWebsite: String,
    @SerializedName("stickers")
    var stickers: List<StickerModel>,
    @SerializedName("animated_sticker_pack")
    val animatedStickerPack: Boolean,
    var androidPlayStoreLink: String? = "",
    var iosAppStoreLink: String? = "",
    @SerializedName("category_id")
    var categoryId: Int,
    @SerializedName("last_update")
    val lastUpdate: String,
    @SerializedName("sticker_size")
    val stickerSize: String,
    var isLock: Boolean = false

)