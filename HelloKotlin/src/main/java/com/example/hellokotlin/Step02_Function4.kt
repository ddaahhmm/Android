package com.example.hellokotlin

//read only List<Int>
val nums2 = listOf(1,2,3,4,5,6,7,8,9,10)

fun main(){
    //num2에 5보다 큰 item만 남겨진 새로운 List 얻어내기
    val result =nums2.filter {
        it >5
    }

    //nums2의 모든 item에 2를 곱한 후 5보다 큰 item만 남겨진 새로운 List 얻어내기
    val result2 = nums2.map { it*2 }.filter { it>5 }

    val result3 = nums2.filter { it %2 ==0}
    println(result3)
}