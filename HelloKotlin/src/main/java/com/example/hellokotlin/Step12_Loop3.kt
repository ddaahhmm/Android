package com.example.hellokotlin

fun main(){
    val nums= mutableListOf(10,-5,-6,1,4,-7,-8,20,30,-15,-13)

    //nums list에서 음수 모두 제거
    for(i in nums.size-1 downTo  0){ //삭제할때 인덱스 에러가 뜨기 때문에 역순으로 검사하기

        //만일 i번째 인덱스의 아이템이 음수라면
        if(nums[i] < 0) {
            //nums에서 i번째 인덱스 삭제
            nums.removeAt(i)
        }
    }

    /* for(i in nums.indices.reversed()){
        if(nums[i]<0){
        println(item)
        }
       }
    * ->이 형태로도 사용 가능*/
    for(items in nums){
        println (items)
    }

    //삭제된 새로운 배열을 얻어내고 싶다면 .filter() 함수 사용
    val nums2= mutableListOf(10,-5,-6,1,4,-7,-8,20,30,-15,-13)
    val result = nums2.filter { item-> item>=0 } //제거된 새로운 배열

    val result2 = nums2.filter(fun(item):Boolean{
        return item >=0
    })

    val result3 = nums2.filter{item ->
        item >=0
    }

    //람다식의 매개변수가 1개인 경우 매개변수를 선언하지 않고 it으로 매개변수에 전달된 값을 지칭할 수 있음
    val result4 = nums2.filter{it>=0}

    println(result)


}