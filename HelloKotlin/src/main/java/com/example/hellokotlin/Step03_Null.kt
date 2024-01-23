package com.example.hellokotlin

fun main(){
    var a:String
    var b:String="AAA"
    var c:String?=null

    //println(a.length) <- a가 초기화 되어있지 않았기 때문에 a 사용 불가
    println("문자열의 길이 : " + b.length)

    //println(c.length) <- c가  NULL인 가능성이 있기 때문에 ERROR
    println("문자열의 길이 : " + c?.length) // c뒤에 ?붙여주기 (null safe)
    println("main 함수가 종료")


}