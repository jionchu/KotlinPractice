package doit.kotlin.chap02

/**
 * Created by jionchu on 2021-06-24
 */

fun main() {
    /* 자료형 검사 */
    var str1: String = "Hello Kotlin"
    //str1 = null // 오류! null을 허용하지 않음
    println("str1: $str1")

    /* null 처리하기 */
    var str2: String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2")
    //println("length: ${str2.length}") // nullable 변수는 length를 실행할 수 없음
    println("length: ${str2?.length}") // 세이프 콜(?.)로 안전하게 호출할 수 있다.
    //println("length: ${str2!!.length}") str2이 null인 경우 사용할 수 없음

    //조건문 활용
    val len = if(str2 != null) str2.length else -1
    println("str2: $str2 length: $len")

    //엘비스 연산자 ?:
    //변수가 null인지 검사하여
    //null이 아니라면 왼쪽 식을 그대로 실행
    //null이라면 오른쪽 식을 실행
    println("str2: $str2 length: ${str2?.length ?: -1}") //조건식을 사용하는 것과 동일함
}