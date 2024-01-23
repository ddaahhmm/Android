package com.example.hellokotlin

fun main(){
    //수정 가능한 Map
    val mem = mutableMapOf<String,Any>()
    // 필요한 만큼 데이터를 저장할 수 있다.
//    mem.put("num", 1)
//    mem.put("name", "AAA")
//    mem.put("isMan", true)
//
//    // 동일한 key 값으로 기존의 value 덮어쓰기
//    mem.put("name","BBB")

    mem["num"] = 1
    mem["name"] = "AAA"
    mem["isMan"] = true

    // 동일한 key 값으로 기존의 value 덮어쓰기
    mem["isMan"] = false

    val num=mem["num"] as Int
    val name = mem["name"] as String
    val isMan = mem["isMan"] as Boolean




}