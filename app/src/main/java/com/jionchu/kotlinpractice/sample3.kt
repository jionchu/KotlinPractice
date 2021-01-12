package com.jionchu.kotlinpractice

/**
 * Created by jionchu on 2021-01-12
 */

class Book private constructor(val id : Int, val name : String) {
    companion object BookFactory : IdProvider {

        override fun getId() : Int {
            return 444
        }

        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
//    val Book = Book() //Book 클래스가 private이기 때문에 사용 불가
    val book = Book.create()
    println("${book.id} ${book.name}")
}