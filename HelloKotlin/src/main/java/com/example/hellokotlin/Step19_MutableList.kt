package com.example.hellokotlin

fun main(){
    //MutalbeList<String> type
    val foods = mutableListOf<String>("AA", "BB")
    //mutable 이기 때문에 아이템 추가 가능
    foods.add("CC")
    foods.add("DD")
    foods.add("EE")

    //아이템 수정 가능
    foods.set(0,"XX")
    foods[1]="OO"

    //아이템 삭제 가능
    foods.removeAt(2)// 2번 index 아이템 삭제
    foods.removeLast() //마지막 인덱스의 아이템 삭제


}