package com.example.hellokotlin

fun main(){
    class Member{
        var num:Int?=null
        var name:String?=null
        var isMan:Boolean?=null
        fun showInfo(){
            println("${this.num}, ${this.name}, ${this.isMan}")

        }
    }

    val m1=Member()
    m1.num=1
    m1.name="AAA"
    m1.isMan=true
    m1.showInfo()

    val m2=Member()
    val a:Unit = with(m2){
        num=2
        name="BBB"
        isMan=true
        showInfo() //Unit type
    }

    val m3=Member()
    val result:String = with(m3){
        num=3
        name="CCC"
        isMan=false
        "${this.num} ${this.name} ${this.isMan} 입니다."
        //맨 마지막에 있는 것이 return type (여기에서는 "" -> String)
    }
}