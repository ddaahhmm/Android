package com.example.hellokotlin

class Member(var num:Int, var name:String, var addr:String)

//data 예약어를 붙이면 toString() 메소드가 자동 재정의 되고 copy() 메소드가 생긴다
//콘솔창에 출력했을 때 필드에 저장된 내용을 알 수 있다.
data class Member2(var num:Int, var name:String, var addr:String)

fun main(){
    val m1 = Member(1,"AAA", "AAA-AAA")
    println(m1) //해당 객체에 대한 정보들이 출력됨 (참조값)
    val m2 = Member2(2, "BBB", "BBB-BBB")
    println(m2) //어떤 내용을 담고있는지 출력해줌
    val m3 = m2.copy()
    println(m3)

    if(m2 == m3 ) println("m2와 m3는 같다.") else println("m2와 m3를 같지 않다.")
}