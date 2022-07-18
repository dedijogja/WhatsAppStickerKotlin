package com.dedijogja.whatsappstickerkotlin.repo

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class Requests {

    companion object {
        var queue : RequestQueue? = null
        fun getRequest(context : Context) : RequestQueue{
            if(queue == null){
                queue = Volley.newRequestQueue(context)
            }
            return queue!!
        }
    }


}