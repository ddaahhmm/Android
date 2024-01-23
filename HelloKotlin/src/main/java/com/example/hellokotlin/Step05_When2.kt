package com.example.hellokotlin

import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    println("점수 입력 : ")
    val jumsu =scan.nextInt()
    when(jumsu){
        in 90..100 -> println("90에서 100사이 입니다.")
        in 80..90 -> println("80에서 90사이 입니다.")
        in 70..80 -> println("70에서 80사이 입니다.")
        in 60..70 -> println("60에서 70사이 입니다.")
    }

    println("-------------")
    when{
        jumsu >= 90 -> println("점수는 90이상 입니다.")
        jumsu >= 80 -> println("점수는 80이상 입니다.")
        else -> println("점수는 80아래 입니다.")
    }

    when(jumsu){
        in 90..100 -> println("A 학점")
        in 80 .. 90 -> println("B 학점")
        in 70 until 80 -> println("C 학점")
        else -> println("ABC 이외의 학점")
    }
}
