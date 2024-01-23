package com.example.hellokotlin

fun main(){
    //테스트용 클래스
    class Member{
        var num:Int?=null
        var name:String?=null
        var isMan:Boolean?=null
        fun showInfo(){
            println("${this.num} ${this.name} ${this.isMan}")
        }
    }

    val m1 =Member().apply {
        num=1
        name="AAA"
        isMan=true
        showInfo()
        //apply는 this(Member)를 리턴
    }
    val m2 =with(Member()){
        num=2
        name="BBB"
        isMan=true
        showInfo()
        this //with는 가장 마지막 라인에 있는 값이 리턴

    }
}