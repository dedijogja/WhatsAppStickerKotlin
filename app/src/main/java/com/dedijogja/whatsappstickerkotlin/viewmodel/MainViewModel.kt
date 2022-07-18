package com.dedijogja.whatsappstickerkotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dedijogja.whatsappstickerkotlin.model.DataModel

class MainViewModel : ViewModel() {

    private val dataModel = MutableLiveData<DataModel>()

    fun setValue(dm: DataModel){
        dataModel.value = dm
    }

    fun getValue() : MutableLiveData<DataModel>{
        return dataModel
    }

}