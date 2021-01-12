package com.jionchu.kotlinpractice

/**
 * Created by jionchu on 2021-01-12
 */

//1. Lambda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
//1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a :Int)
//2) return 값으로 사용할 수가 있다.

//람다의 기본정의
//val lambdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}
val nameAge = {name:String, age:Int -> "My name is ${name} I'm ${age}"}

fun main() {
    println(square(12))
    println(nameAge("jion", 23))

    val a = "joyce said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendsString("ariana", 27))

    println(calculateGrade(971))

    val lambda = {number : Double ->
        number == 4.3213
    }

    println(invokeLambda(lambda))
    println(invokeLambda({it > 3.22}))
    println(invokeLambda{ it > 3.22 })


}

//확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendsString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = { "I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 Return
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}
