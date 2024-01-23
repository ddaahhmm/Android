package com.example.hellokotlin

class StarBucks{
    var location:String? = null
        //필드에 값을 대입할 때 호출 되는 함수
        set(value) {
            //value 는 필드에 대입할 값이고 field 는 실제 필드를 가르킴
            field=value+" Store"
        }

        //필드의 값을 참조할 때 호출 되는 함수
        get() {
            if(field==null){
                return "None"
            }else{
                return field
            }
        }

    fun showInfo(){
        println(location)
    }
}

fun main(){
    val s1 = StarBucks()
    s1.location = "GangNam Station"
    s1.showInfo()

    val s2=StarBucks()
    s2.showInfo()
    println(s2.location)

}