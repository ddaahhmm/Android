package com.example.hellokotlin

// 함수 type을 전달받는 함수를 정의

fun useFun(a:()->Unit){
    //매개 변수 a 에 전달된 함수 호출
    a()
}

//메인 메소드
fun main(){
    //useFun() 함수를 호출
    useFun(fun(){
        println("hi")
    })

    useFun({
        println("HI")
    })

    //함수를 호출하는 표현식 () todfir rksmd
    useFun{
        println("HHII")
    }
}