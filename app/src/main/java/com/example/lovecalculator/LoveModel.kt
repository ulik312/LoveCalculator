package com.example.lovecalculator

import com.google.gson.annotations.SerializedName


//fname: "John"
//sname: "Alice"
//percentage: "46"
//result: "Can choose someone better."

data class LoveModel (
    @SerializedName("fname") //переименовали для бекенда
    var firstName:String,
    @SerializedName("sname") //переименовали для бекенда
    var secondName:String,
    var percentage:String,
    var result:String,
        )