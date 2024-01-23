package com.example.hellokotlin

fun main(){
    //Remocon type의 참조값을 간단히 얻어내기

    //클래스를 정의함과 동시에 객체를 생성하는 것이 object keyword
    val r1:Remocon = object : Remocon{
        override fun up() {
           println("Chennel up")
        }

        override fun down() {
            println("Chennel Down")
        }


    }

    r1.up()
    r1.down()
}