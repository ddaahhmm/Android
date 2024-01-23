package com.example.hellokotlin


fun main(){
    val num=10
    //변수나 상수 선언을 미리하고
    val result:String

    //조건부로 다른 값을 대입
    if(num%2 ==1){
        result="$num 은 홀수 입니다."
    }else{
        result="$num 은 짝수 입니다."
    }

    //3항 연산자 존재 X -> 대신 하여 아래와 같이 작성 가능
    //if 문이 어떤 data를 해당 위치에 남기기도 함
    //if 문이 남긴 data(return data)가 대입 연산자를 통해 변수에 대입됨
    val result3 : String = if(num%2==1){"$num 은 홀수 입니다."}else{"$num 은 짝수 입니다."}

    //실행할 code 블럭이 없다면 중괄호 생략 가능
    val result4 : String = if(num%2==1)"$num 은 홀수 입니다." else "$num 은 짝수 입니다."

    val result5 : String? = if(num%2==1)"$num 은 홀수 입니다." else null //단일 if문 으로 중괄호 생략은 불가 !
}
