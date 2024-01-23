package com.example.hellokotlin

/*
* Array -> item 수정 가능, 추가 불가
* List -> item 수정, 추가 불가
* MutableList -> item 수정,추가 가능
* */
fun main(){
    //정수 배열(array) 객체 생성하기
    val nums = arrayOf(10,20,30)
    val nums2 = listOf<Int>(10,20,30)

    //문자 배열
    val names = arrayOf("AAA","BBB","CCC")
    val names2 = listOf("AAA","BBB","CCC")

    //array 수정
    nums[0] = 100
    nums.set(1,200) //index 1 에 있는 값을 200 으로 변경

    //array도 map, filter 함수 사용 가능
    val result:List<Int> = nums.map{
        it*2
    }

    //forEach 사용 가능
    nums.forEach {
        println(it)
    }




}