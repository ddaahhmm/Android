package com.example.hellokotlin

// 클래스 상속

/* 클래스 선언시 기본값은 상속을 받지 못하게 되어있다.
마치 java 에서 final class Phone{}
상속을 받을 수 있게 하려면 open 이라는 예약어를 붙여준다
* */
open class Phone{
    fun call(){
        println("Call")
    }
}

open class HandPhone : Phone(){
    fun mobileCall(){
        println("Call Someone by walking")
    }

    //재정의 가능한 메소드를 만들려면 open 예약어를 붙여야 한다
    open fun takePicture(){
        println("Take a picture to 10 million pixel")
    }
}

class SmartPhone : HandPhone(){
    fun doInternet(){
        println("Do Internet")
    }
    //override 라는 예약어를 이용해서 open 된 메소드를 오버라이드 할 수 있다.
    override fun takePicture() {
        //필요시 부모의 메소드를 호출 할 수 있다. (java와 동일)
        super.takePicture()
        println("Take a picture to 100 million pixel")
    }
}

fun main(){
    val p1=Phone()
    val p2=HandPhone()

    //Phone 클래스를 상속받은 클래스로 생성한 객체이므로 3개의 메소드를 모두 사용할 수 있음
    p2.call()
    p2.mobileCall()
    p2.takePicture()

    val p3=SmartPhone()
    p3.doInternet()
    p3.takePicture()
}