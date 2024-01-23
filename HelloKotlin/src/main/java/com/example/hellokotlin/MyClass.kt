package com.example.hellokotlin

/*
* [kotlin 기본 data type]
* - import 없이 바로 사용할 수 있는 data type
* Byte, Short, Int, Long
* Float,Double
* Boolean, Char
* String
* */
fun main(){
    println("hello world")

    //정수를 담을 수 있는 num 이라는 이름의 변수를 선언
    var num:Int = 10

    //실수를 담을수 있는 num2라는 이름의 변수를 선언
    var num2:Double = 10.1

    //문자열을 담을수 있는 myName이라는 이름의 변수 선언
    var myName:String = "AAA"

    //num은 변수(var) 라서 값 변경 가능
    num = 11

    //val은 상수를 만들때 사용하는 예약어 -> 값이 한번 결정되면 변경 불가
    val num3:Int = 20
    //num3=10 (X)
    var num4=10
    var num5=10.1
    var yourName="BBB"

    //변수를 미리 선언하고
    var num6:Int
    //값 나중에 넣기
    num6 = 10

    //상수도 미리 선언하고
    val PI:Float
    //값 나중에 넣을 수 있음
    PI = 3.14f


}