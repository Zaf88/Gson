package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val gson = Gson()

        //from  Json String to objects
        val resultObject = gson.fromJson(response, JsonModel::class.java )
        Log.e("LOG =>", resultObject.toString())

        val profileJsonString = gson.toJson(JsonObject().apply {
            addProperty("dob", resultObject.profile.dob)
            addProperty("name", resultObject.profile.name)
            addProperty("address", resultObject.profile.address)
            addProperty("company", resultObject.profile.company)
            addProperty("location", gson.toJson(resultObject.profile.location))
        })

        //objects to String Json
        val resultJsonString =gson.toJson(resultObject)

        Log.e("LOG =>", resultJsonString)}}
