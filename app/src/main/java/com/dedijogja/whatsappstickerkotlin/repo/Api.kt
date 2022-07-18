package com.dedijogja.whatsappstickerkotlin.repo

import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest

class Api {

    fun fetchData(url : String, context: Context, apiListener: ApiListener){
        Requests.getRequest(context).add(StringRequest(Request.Method.GET, url, { response ->
            apiListener.onSukses(response)
        }, {
            apiListener.onGagal(it.message.orEmpty())
        }))
    }

    interface ApiListener{
        fun onSukses(response : String)
        fun onGagal(errorMessage : String)
    }

}