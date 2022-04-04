package com.preferkim.kotlin_syntax

fun main() {

    stringTemplate()
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
