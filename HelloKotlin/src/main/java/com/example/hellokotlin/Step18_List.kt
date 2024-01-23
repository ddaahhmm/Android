package com.example.hellokotlin

fun main(){
    val names = listOf<String>("AAA","BBB","CCC")
    val nums = listOf<Int>(10,20,30)

    //names list의 0번 index 참조
    val a = names.get(0)

    //names list의 0번 index 참조 2
    val b = names[0]

    //names의 item 개수 참조
    val c = names.size
    val d= names.lastIndex

    //list의 모든 item을 순회하면서 참조
    names.forEach{
        println(it)
    }

    for(i in names.indices){
        val tmp = names.get(i)
        println("${i} 번재 인덱스 ${tmp}")
    }

    //역순으로 순회하기
    for(i in names.lastIndex downTo 0){
        val tmp = names.get(i)
        println("${i} 번재 인덱스  : ${tmp}")
    }
}