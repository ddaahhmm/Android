package com.example.hellokotlin

fun main(){
    /*
         in java => public void a (){}
         in kotlin => fun a():Unit() or fun a(){}
         코틀린에서 Unit은 원시 type이라고 지칭하고 java의 void와 비슷한 역할을 함
     */
    // 함수명() : returnType { }
    fun a():Unit{
        println("a function called!")
    }

    //이름 없는 함수를 만들어 그 참조값을 변수에 담기
    var b = fun(){}

    /*
    *  [ 함수의 type 정의 하는 방법]
    *
    * (매개 변수의 모임) -> returnType
    * */
    var c:() ->Unit = fun():Unit{ }

    //String type 을 전달 받아 해당 문자열의 길이를 리턴하는 함수
    //함수의 type을 정확히 명시해서
        var d:(String)->Int = fun(str:String):Int{
            return str.length
        }
    d = fun(a:String) : Int{return 999} //(String) -> Int type이기 때문에 대입 가능

    var test : (Int, String) -> Int
    //test 라는 변수에 값을 대입 하기


}