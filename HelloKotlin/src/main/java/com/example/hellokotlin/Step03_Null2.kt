package com.example.hellokotlin

fun main(){
    var str : String = "abcde12345"
    var str2 : String? = "abcde12345"


    //문자열의 길이를 참조 해서 변수에 담기
    var length = str.length //Int type
    var length2:Int? = str2?.length //Int? type

    //Elvis 연산자 ?: 는 null일 경우에 기본 값을 남기는 연산자
    //str2?.length 가 만일 null 이면 0을 남기기 때문에 대입 연산자의 우측이 null일 가능성은 없다
    //따라서 length3은 Int? 이 아닌 Int type 으로 선언할 수 있다.
    var length3:Int = str2?.length ?: 0
}
