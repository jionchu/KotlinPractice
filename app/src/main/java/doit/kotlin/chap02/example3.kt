package doit.kotlin.chap02

/**
 * Created by jionchu on 2021-06-19
 */

fun main() {

    /* 정수 자료형 */
    val num05 = 127 // Int형으로 추론
    val num06 = -32768 //Int형으로 추론
    val num07 = 2147483647 //Int형으로 추론
    val num08 = 9223372036854775807 //Long형으로 추론
    
    val exp01 = 123 // Int형으로 추론
    val exp02 = 123L // 접미사 L을 사용해 Long형으로 추론
    val exp03= 0x0F // 접두사 0x를 사용해 16진 표기가 사용된 Int형으로 추론
    val exp04 = 0b00001011 // 접두사 0b를 사용해 2진 표기가 사용된 Int형으로 추론
    val exp05 = 0x0FL //접두사 0x와 접미사 L을 사용해 16진 표기가 사용된 Long형으로 추론

    /* 작은 범위의 자료형을 사용하는 경우 */
    val exp08: Byte = 127 // 명시적으로 자료형 지정
    val exp09 = 32767 // 명시적으로 지정하지 않으면 Short형 범위의 값도 Int형으로 추론
    val exp10: Short = 32767 // 명시적으로 자료형 지정

    /* 부호가 없는 정수 자료형 */
    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    /* 실수 자료형 */
    val ex01 = 3.14 // Double형으로 추론
    val ex02 = 3.14F // 식별자 F에 의해 Float로 추론
    val ex03 = 3.14E-2 // 왼쪽으로 소수점 2칸 이동 -> 0.0314
    val ex04 = 3.14e2 // 오른쪽으로 소수점 2칸 이동 -> 314

    /* 정수 자료형과 실수 자료형의 최솟값, 최댓값 출력 */
    println("Byte min: ${Byte.MIN_VALUE} max: ${Byte.MAX_VALUE}")
    println("Short min: ${Short.MIN_VALUE} max: ${Short.MAX_VALUE}")
    println("Int min: ${Int.MIN_VALUE} max: ${Int.MAX_VALUE}")
    println("Long min: ${Long.MIN_VALUE} max: ${Long.MAX_VALUE}")
    println("Float min: ${Float.MIN_VALUE} max: ${Float.MAX_VALUE}")
    println("Double min: ${Double.MIN_VALUE} max: ${Double.MAX_VALUE}")
    
}