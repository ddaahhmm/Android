package com.example.hellokotlin

/*
* kotlin 에서 배열(list)과 반복문
* */

fun main(){
    //수정 불가능한 List(read only)
    val names = listOf<String>("Kim", "Lee", "Park")

    //type 추론이 가능하기에 상수 type 선언 생략
    val animals= listOf("Dog","Cat","Elephant")

    val nums= listOf(10,20,30)

    //배열 참조
    println(names[0])
    println(names[1])
    println(names[2])
    println("-----------")
    println(names.get(0))
    println(names.get(1))
    println(names.get(2))

    //read only이기 때문에 수정 불가
    // names[0] = "BBB" (X)

    val result=names.indices

    for(i in names.indices){
        println(i)
    }
    println("----------")

    for(i in names.indices){
        println("$i : ${names[i]}")
    }
    println("-----------")
    for(item in names){
        println(item)
    }
    println("---------------")
    names.forEach(fun(item){
        println(item)
    })
    println("---------------")
    names.forEach{
        println(it)
    }

}
