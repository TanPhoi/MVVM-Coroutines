package com.example.mvvm_coroutines.data.remote.model

import com.google.gson.annotations.SerializedName

data class ItemData (
    @SerializedName("id")
    var id : Int? = null
)