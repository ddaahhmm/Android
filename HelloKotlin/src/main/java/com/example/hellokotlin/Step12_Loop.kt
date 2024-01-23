package com.example.hellokotlin

fun main(){
    //수정 가능한 String 목록
    val names:MutableList<String> = mutableListOf<String>("AAA","BBB","CCC","DDD","EEE")

    //수정 불가능한 String 목록
    val names2 = listOf<String>("AAA","BBB","CCC","DDD","EEE")

    names.add("XXX") //names2.add 는 불가
    println(names)

    for(item in names){
        println(names)
    }

    println("----------")

    //index도 필요하다면
    for(i in names.indices){
        println("$i 번째 인덱스 : ${names[i]}") //배열 문법으로 참조
        println("$i 번재 인덱스 : ${names.get(i)}") //메소드를 이용해서 참조
    }

    //names에 모두 "님" 붙이기 (수정)
    for(i in names.indices){
        names[i] = names[i] + "님"
        //names[i] = names.get(i) +"님"
        //names.set(i,names.get(i)+"님") -> 두개 다 가능
    }
}
