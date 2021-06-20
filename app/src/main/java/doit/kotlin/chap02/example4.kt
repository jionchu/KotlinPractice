package doit.kotlin.chap02

/**
 * Created by jionchu on 2021-06-20
 */

fun main() {
    /* 논리 자료형 */
    val isOpen = true // Boolean형으로 추론
    val isUploaded: Boolean // 변수를 선언만 하는 경우 자료형을 명시해줘야 함

    /* 문자 자료형 */
    val ch = 'c' // Char형으로 추론
    val ch2: Char // 변수를 선언만 하는 경우 자료형을 명시해줘야 함

    val ch3 = 'A'
    println(ch3+1) // B

    // val ch4: Char = 'ab' // 2개 이상의 문자는 담을 수 없음
    // val chNum: Char = 65 // 숫자를 사용하여 선언하는 것은 금지

    /* 정수 자료형을 이용해 문자 자료형 선언하는 경우 */
    val code: Int = 65
    val chFromCode: Char = code.toChar() // code에 해당하는 문자 할당
    println(chFromCode)

    /* 문자열 선언 */
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    // 코틀린은 String Pool을 이용해 메모리 공간을 재활용하기 때문에
    // 문자열 내용이 같은 경우 참조 주소가 동일하다.
    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    /* 특수문자 표현 */
    val special = "\"hello\", I have \$15" // 백슬래시(\)를 붙여 표현
    println(special)

    val special2 = "${'"'}hello${'"'}, I have ${"$15"}" // 중괄호를 사용해 표현
    println(special2)

    /* 형식화된 다중 문자열 */
    //보이지 않는 문자가 포함된 문자열(줄바꿈, 탭, 공백)을 한 번에 출력할 때 유용함
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num) // num의 값은 $num
    """ // """로 감싼 문자열의 모든 내용이 그대로 출력됨

    println(formattedString)
}

/* 자료형에 별명 붙이기 */
typealias Username = String // String을 Username이라는 별명으로 대체
val user: Username = "Kildong" // Username은 String과 같은 표현