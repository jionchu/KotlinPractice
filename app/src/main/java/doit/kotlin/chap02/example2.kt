package doit.kotlin.chap02

/**
 * Created by jionchu on 2021-06-18
 */

fun main() {
    val number = 10 // number 변수를 Int 자료형으로 추론
    var language = "Korean" // language 변수를 String 자료형으로 추론
    val secondNumber: Int = 20 // secondNumber 변수는 Int형으로 자료형을 지정
    language = "English" // var 키워드로 선언한 변수는 값을 다시 할당 가능

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}