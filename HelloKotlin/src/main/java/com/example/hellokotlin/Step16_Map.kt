package com.example.hellokotlin

fun main(){
    // Readonly Map type 객체 만들기
    val mem = mapOf<String,Any>("num" to 1, "name" to "AAA", "isMan" to true)

//    val num:Any? = mem.get("num")
//    val name:Any? = mem.get("name")
//    val isMan:Any? = mem.get("isMan")

    //아래와 같이 참조 할 수도 있다.
//    val num = mem["num"]
//    val name = mem["name"]
//    val isMan = mem["isMan"]

    //casting 까지 동시에 하기
    val num = mem.get("num") as Int
    val name = mem.get("name") as String
    val isMan = mem.get("isMan") as Boolean



}