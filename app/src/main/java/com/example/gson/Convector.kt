package com.example.gson


import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonObject

class Convector {
//    Конвертация body-object в формат Json
    val gson = Gson()

        private val request = gson.toJson(JsonObject().apply {
            addProperty("count", 5)
            addProperty("country", "ru")
            addProperty("list", gson.toJson(listOf("123", "1234567", "7654321")))
        })


//        Конвертация  формат Json в data class
private val response = "{\"count\":5,\"country\":\"ru\",\"list\":[\"123\",\"1234567\",\"7654321\"]}"

       private val model=gson.fromJson(response, SampleModel::class.java)


}