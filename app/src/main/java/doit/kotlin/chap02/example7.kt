package doit.kotlin.chap02

/**
 * Created by jionchu on 2021-09-08
 */

/* 기본 연산자 */
fun main() {
    /* 산술 연산자 */
    // 사칙연산에 사용되는 사칙 연산자(+, -, *, /)와 나머지 연산자(%)
    val n = 1
    if ((n % 2) == 1) { // 홀수
        println("n is an Odd number")
    }
    if ((n % 2) == 0) { // 짝수
        println("n is an Even number")
    }

    /* 대입 연산자 */
    // 대입 연산자(=): 변수에 값을 할당하는 연산자
    val numOfApple = 12 // 변수가 대입 연산자에 의해 할당
    val result = numOfApple -2 // 표현식이 대입 연산자에 의해 결과값 할당

    var num = 3
    num = num + 2 // 산술 연산자와 대입 연산자를 함께 사용하는 경우
    num += 2 // 이렇게 간결하게 표현

    /* 증가, 감소 연산자 */
    var num1 = 10
    var num2 = 10
    val result1 = ++num1 // num 값 증가 후 대입
    val result2 = num2++ // 먼저 num 값 대입 후 증가

    println("result1: $result1")
    println("result2: $result2")
    println("num1: $num1")
    println("num2: $num2")

    /* 논리 연산자 */
    var check = (5 > 3) && (5 > 2) // 2개의 항((5 > 3), (5 > 2))이 모두 참이면 true
    check = (5 > 3) || (2 > 5) // 2개의 항 중 1개의 항이 참이면 true
    check = !(5 > 3) // true는 false로, false는 true로 변경
}