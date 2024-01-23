package com.example.hellokotlin

//kotlin에서 인터페이스 만들기
interface Remocon{
    fun up()
    fun down()
}

//인터페이스를 구현한 클래스 만들기
class MyRemocon : Remocon {
    override fun up() {
        println("Something Up")
    }

    override fun down() {
        println("Something Down")
    }

    fun move(){
        println("Move")
    }

}

fun main(){
    val r1:MyRemocon = MyRemocon()
    val r2:Remocon = MyRemocon()

    //r1은 MyRemocon type 이기 때문에 모든 move() 메소드도 사용가능
    r1.up()
    r1.down()
    r1.move()

    //r2는 Remocom type 이기 때문에 move() 메소드 사용 불가
    r2.up()
    r2.down()

    //in java(MyRemocon)r2
    //in kotlin r2 as MyRemocon
    val r3:MyRemocon = r2 as MyRemocon //kotlin 의 type casting
    r3.move()

    //in java  : r2 instanceof MyRemocon
    //in kotlin  : r2 is MyRemocon
    if(r2 is MyRemocon){ //r2가 MyRemocon 타입인지 확인하는 기능(true or false) : is
        //smart casting 형 변환 없이 바로 MyRemocon 기능을 사용할 수 있음
        r2.move()
    }
}