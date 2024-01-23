package com.example.hellokotlin

abstract class Weapon {
    fun move() {
        println("Move")
    }

    //추상 메소드 역시 abstract 예약어를 이용해 만든다
    abstract fun attack()
}

//추상클래스로 일반 클래스를 상속받는 문법과 같다.
class MyWeapon : Weapon(){
    //추상메소드를 오버라이드가 강제
    override fun attack() {
      println("Attack Something")
    }

}


fun main(){
    val w1:Weapon = MyWeapon()
    w1.move()
    w1.attack()

    //따로 클래스를 정의하지 않고 object 키워드를 이용해서 Weapon type의 참조값 얻어내기
    val w2:Weapon = object :Weapon(){
        override fun attack() {
            println("Attack to other army ")
        }
    }
    w2.move()
    w2.attack()

    //다형성 확인
    val w3:MyWeapon = MyWeapon()
    val w4:Weapon = w3
    val w5:Any = w3 // Any type은 java에서 Object type 에 해당
}
