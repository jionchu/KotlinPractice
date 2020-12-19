package com.jionchu.kotlinpractice

/**
 * Created by jionchu on 2020-12-19
 */

//Kotlin의 class는 file class
//다른 class에서 상속하려면 open 써줘야 함
open class Human (val name: String = "Anonymous") {

    //java
    /*class Person {
        public Person(String name) {}
        public Person(String name, int age) {this(name);}
    }
    */

    //init 실행 후 constructor 실행
    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, ${age} years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so YUMMY~~")
    }

    open fun signASong() {
        println("lalala")
    }
}

class Korean : Human() {
    override fun signASong() {
        super.signASong()
        println("랄랄라")
        println("my name is ${name}")
    }
}

fun main() {
    val human = Human("jion")
    val stranger = Human() //name default 값 있기 때문에 입력 안해도 됨
    human.eatingCake()

    val me = Human("Jion", 23)

    println("This human's name is ${stranger.name}")

    val korean = Korean()
    korean.signASong()
}