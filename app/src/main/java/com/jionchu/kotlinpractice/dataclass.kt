package com.jionchu.kotlinpractice

/**
 * Created by jionchu on 2021-01-12
 */

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("koreanAir","jionChu","2021-01-12",14)
    val ticketB = TicketNormal("koreanAir","jionChu","2021-01-12",14)

    println(ticketA) //데이터 확인 가능
    println(ticketB) //메모리 주소값 출력
    
}