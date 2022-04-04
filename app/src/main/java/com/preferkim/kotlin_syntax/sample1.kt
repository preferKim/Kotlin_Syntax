package com.preferkim.kotlin_syntax

fun main() {
    checkNum(1)
}

// 1. 함수
fun helloWorld(): Unit { // return type 없을 때 (void)
    print("Hello World!")
}

fun add(a: Int, b: Int): Int { // a와 b는 Int형, return type: Int
    return (a + b)
}

// 2. val vs var
fun hi() {
    val a: Int = 10 // value, 정해진 값(constant)

    var b: Int = 9 // variable, 변수

    var e: String // 변수 바로 선언 안 해도 타입은 적어주는 게 좋다다
}

// 3. String Template
fun stringTemplate(): Unit {
    val name = "joyce"
    val lastName = "Hong"

    println("my name is ${name + lastName} I'm 23")

    println("\$a") // '$'를 쓰고 싶으면 앞에 백슬래쉬 하나
}

// 4. 조건식 - if
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// Java의 삼항 연산자 : return (a > b) ? a : b // 참일 때 a, 거짓일 때 b 리턴
// 코틀린에서는 삼항 연산자가 없기 때문에 아래처럼 쓴다
fun maxBy2(a: Int, b: Int) = if (a > b) a else b

// 조건식 - when
fun checkNum(score: Int) { // 리턴타입 없음
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")// 복수 인정 가능
        else -> println("this is else")
    }

    // when은 return식으로도 사용이 가능하다. 다만 이때는 else를 무조건 써줘야한다.
    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")

    when (score) {
        in 90..100 -> println("You are genius") // when 90 <= score <= 100, println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }

}
