package com.example.hellokotlin

class Cat{

    //선언만 하고 값을 나중에 넣을 예정이라면 lateinit  이라는 예약어를 붙여준다.
    //값을 나중에 넣고 싶지만 null이 가능한 type은 싫을 때 사용
    lateinit var name:String

    //필드에 값을 넣어 주는 메소드
    fun putName(name:String){
        this.name = name
    }
}

class Cat2{

   var name:String? = null

    //필드에 값을 넣어 주는 메소드
    fun putName(name:String){
        this.name = name
    }
}

fun main(){
    val c1 = Cat()
    c1.putName("TomCat")

    val c2 = Cat2()
    c2.putName("MakJi")

    println(c1.name)
    println(c2.name)
}