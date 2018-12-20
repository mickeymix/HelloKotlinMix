package com.example.cars

fun main(args: Array<String>) {
    var testLet:String? = null
//    testLet = "midd"
    testLet?.let {
        println("mixmix $it")
    }?:  println("mixmix")


    testLet?.apply {

        println(this)
    }

}