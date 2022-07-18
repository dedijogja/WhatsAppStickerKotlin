package com.dedijogja.whatsappstickerkotlin.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dedijogja.whatsappstickerkotlin.model.DataModel
import com.dedijogja.whatsappstickerkotlin.repo.Api
import com.dedijogja.whatsappstickerkotlin.utils.Constant

class MainViewModel : ViewModel() {

    private val dataModel = MutableLiveData<DataModel>()

    fun setValue(context: Context){
        if(dataModel.value == null){
            Api.fetchData(Constant.serverUrl, context, object : Api.ApiListener{
                override fun onSukses(response: String) {
                    TODO("Not yet implemented")
                }

                override fun onGagal(errorMessage: String) {
                    dataModel.value = null
                }

            })
        }
    }

    fun getValue() : MutableLiveData<DataModel>{
        return dataModel
    }

}