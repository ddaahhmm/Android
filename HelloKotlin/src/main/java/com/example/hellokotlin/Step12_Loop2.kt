package com.example.hellokotlin

fun main(){
    //1 - 10까지 출력
    for(num in 1..10){
        println(num)
    }

    println("-------------")
    for(num in 10 downTo 1){
        println(num)
    }

    //1,3,5,7,9 .. 2씩 증가 시키면서 출력
    println("-------------")
    for(num in 1..10 step 2){
        println(num)
    }

    println("------------")
    //10,8,6,4,2 2씩 감소 시키면서 출력
    for(num in 10 downTo 1 step 2){
        println(num)
    }
    val names = listOf("AAA","BBB","CCC","DDD","EEE")
    val len = names.size
    //반목문 돌면서 역순으로 출력
    for(i in len-1 downTo 0){ //names.size-1 로 표기도 가능
        println(names[i])
    }
}