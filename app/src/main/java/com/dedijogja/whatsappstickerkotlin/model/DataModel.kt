package com.dedijogja.whatsappstickerkotlin.model

import androidx.lifecycle.ViewModel
//class DataModel extends Android JetPack LifeCycle ViewModel
data class DataModel (val categoryModel: List<CategoryModel>, val stickerPackModel: List<StickerPackModel>) : ViewModel() {



}