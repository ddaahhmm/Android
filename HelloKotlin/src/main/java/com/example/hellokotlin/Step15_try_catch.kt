package com.example.hellokotlin

import java.lang.NumberFormatException
import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    println("숫자 입력 : ")
    val result:String = scan.nextLine()
    try{
        //정수로 변환
        val num= Integer.parseInt(result)
        if(num%2 ==1){
            println("$num 은 홀수 입니다.")
        }else{
            println("$num 은 짝수 입니다.")
        }
    }catch(nfe:NumberFormatException){
        nfe.printStackTrace()
    }
    println("main 함수 종료")

}