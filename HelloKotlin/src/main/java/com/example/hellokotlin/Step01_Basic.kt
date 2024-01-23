package com.example.hellokotlin

fun main(){
    val myName="AAA"
    val yourName="BBB"

    val result = "MY NAME : " + myName
    val result2 = "YOUR NAME : " + yourName

    //${ } javascript backtic 에서 활용했던 표현식도 가능
    val result3 = "OUR NAME : ${myName+yourName}"
    val num1 = 10
    val num2 = 20
    val result4 = "num1+num2 = ${num1+num2}"

    //여러줄의 문자열을 편리하게 작성 할 수 있다.
    val html="""
        <div>
            <p> p요소 입니다. </p>
        </div>
    """

    val html2 = """
        <div>
            <p> p요소 입니다. </p>
        </div>
    """.trimIndent()

    println(html)
    println("----------")
    println(html2)
}