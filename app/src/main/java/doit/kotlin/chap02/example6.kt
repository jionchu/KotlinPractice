package doit.kotlin.chap02

/**
 * Created by jionchu on 2021-06-25
 */

fun main() {
    /* 자료형 변환 */
    // 코틀린에서는 변수 할당 시 자동 형 변환이 되지 않는다.
    val a: Int = 1
    //val b: Double = a //자료형 불일치 오류 발생
    //val c: Int = 1.1 //자료형 불일치 오류 발생
    
    val b: Double = a.toDouble() // 명시적으로 자료형 변환해줘야 함
    
    //자료형이 다른 값들을 연산하면 자료형 범위가 큰 자료형으로 자동 형 변환 됨
    val result = 1L + 3 // Long형 + Int형 -> result는 Long형

    /* 기본형과 참조형 비교 */
    //Int형으로 선언된 변수들을 코틀린 컴파일러가 기본형으로 변환하여 저장함
    //=> 참조 주소가 동일함
    val num1: Int = 128
    val num2: Int = 128
    println(num1 == num2) // true 값이 동일함
    println(num1 === num2) // true 참조가 동일함

    //null을 허용한 변수는 참조형으로 저장됨
    val num3: Int = 128
    val num4: Int? = 128
    println(num3 == num4) // true 값이 동일함
    println(num3 === num4) // false 참조가 다름

    /* 스마트 캐스트 */
    // 어떤 값이 정수일 수도 있고 실수일 수도 있다면?
    // 컴파일러가 자동으로 형 변환을 하는 스마트 캐스트를 사용
    // ex) Number형: 숫자를 저장하기 위한 특수한 자료형 객체
    var test: Number = 12.2 // test는 Float형으로 스마트 캐스트
    println("$test")

    test = 12 // Int형으로 스마트 캐스트
    println("$test")

    test = 120L // Long형으로 스마트 캐스트
    println("$test")

    test += 12.0f // Float형으로 스마트 캐스트
    println("$test")

    /* 자료형 검사 */
    val num = 26
    if (num is Int) {
        println(num)
    } else if (num !is Int) {
        println("Not a Int")
    }

    //is는 변수의 자료형을 검사한 후 그 변수를 해당 자료형으로 변환할 수 있음
    //Any형을 사용하면 자료형을 결정하지 않은 채로 변수를 선언할 수 있음
    val x: Any
    x = "Hello"
    if (x is String) {
        println(x.length) // x는 String으로 스마트 캐스트
    }
    
    /* as로 스마트 캐스트 */
    val y: String = "Kotlin"
    val x1: String = y as String //y가 null이 아닌 경우 String으로 형 변환
    //y가 null이면 예외 발생

    /* 묵시적 변환 */
    var any: Any = 1 // Any형 any는 1로 초기화될 때 Int형이 됨
    any = 20L // Int형이었던 any는 변경된 값 20L에 의해 Long형이 됨
    println("any: $any type: ${any.javaClass}") // any의 자바 기본형을 출력하면 long이 나옴

    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any) {
    if (x is String) {
        println("x is String: $x")
    }
    if (x is Int) {
        println("x is Int: $x")
    }
}