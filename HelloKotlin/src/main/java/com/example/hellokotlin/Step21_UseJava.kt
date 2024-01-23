package com.example.hellokotlin

import com.example.hellokotlin.java.MemberDto

fun main(){
    //java 클래스를 import 해서 객체 생성 후 참조값을 변수에 담기
    val dto:MemberDto = MemberDto()
    //dto.setNum(1) 대신
    dto.num = 1
    dto.name = "AAA"
    dto.addr = "AAA-AAA-AAA"

    //val a:Int = dto.getNum() 대신
    val a = dto.num
    val b = dto.name
    val c = dto.addr

}