package com.example.hellokotlin

import java.util.Scanner

fun main(){
    /*java 패키지에 있는 클래스 import 가능
    * in은 예약어 이기 때문에 backtick으로 감싸기
    * new 예약어 없이 클래스명() 형식으로 객체 생성 */
    val scan: Scanner = Scanner(System.`in`)

    println("Gun:1, Sword:2")
    println("무기를 선택하세요(1 or 2) : ")
    val weapon = scan.nextInt()
    //weapon안에 들어있는 숫자 이용해서 분기하기
    when(weapon){
        //kotlin에는 switch문이 없기에 when이 대신 그 역할 수행
        1 -> {
            println("총으로 공격")
        }
        2 -> println("검으로 공격") //중괄호 생략 가능

        else -> println("주먹으로 공격")
    }
    //대입 연산자의 우측에 when() 문 작성 가능
    //Any type : 모든 타입이든 가능 (In Java : Object)
    val selectedWeapon:Any = when(weapon){
        1->"총"
        2->"검"
        else-> 0
    }
}

