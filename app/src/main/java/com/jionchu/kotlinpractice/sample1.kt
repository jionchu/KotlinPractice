package com.jionchu.kotlinpractice

/**
 * Created by jionchu on 2020-12-19
 */

fun main() {
    helloWorld()
    println(add(4,5))

    //3. String Template
    val name = "jion"
    val lastName = "chu"
    println("my name is ${name + lastName}I'm 23")
    println("this is 2\$a") //$를 문자로 사용하려면 \ 사용

    checkNum(1)

    forAndWhile()

    nullCheck()
}

//1. 함수

fun helloWorld() { //return 하지 않는 경우 :Unit 생략 가능
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value
//var = variable

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b=100

    val c = 10
    var d = 100
    var name = "jionchu"
}

//4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if (a>b) a else b

fun checkNum(score : Int) {
    when (score) { //when이 statement로 쓰임
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score) { //when이 expression으로 쓰임
        1 -> 1
        2 -> 2
        else -> 3
    } //else 필수

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement

//5. Array and List
//Array: 메모리 할당하고 시작
//List 1. List(수정불가) 2. MutableList(수정가능)

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
//    list[0] = 2 불가
    var result = list.get(0);

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20) //list의 주소값은 바뀌지 않음
    arrayList[0] = 20
}

//6. 반복문 for/while

fun forAndWhile() {
    val students = arrayListOf("joyce","james","jenny","jennifer")
    for (name in students) {
        println("${name}")
    }

    for ((index,name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    var index = 0;
    while(index < 10) {
        println("current index : ${index}")
        index++
    }
}

//7. Nullable / NonNull

fun nullCheck() {
    //NPE :Null Pointer Exception

    var name = "joyce" //NonNull type
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase() //null이면 null을 반환

    //?:
    val lastName : String? = null
    val fullName = name + " " + (lastName?: "NO lastName")

    println(fullName)
}

fun ignoreNulls(str : String?) {
    //!!
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    //let
    val email : String? = "jionchu@email.com"
    email?.let { //email이 null인 경우 다음을 실행하지 않음
        println("my email is ${email}")
    }
}
