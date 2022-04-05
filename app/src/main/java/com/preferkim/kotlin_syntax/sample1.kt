package com.preferkim.kotlin_syntax

fun main() {

    forAndWhile()

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


/* (보충) Expression Vs. Statement

- 어떤 식을 써서 '값'을 만들면 표현식임
fun maxBy2(a: Int, b: Int) = if (a > b) a else b 의 경우 값을 만듦으로, 표현식임

- 아래 식의 경우, when이 어떤 값을 만드는 것은 아니므로 Statement(실행하도록 하는 문장)
when (score) {
    0 -> println("this is 0")
    1 -> println("this is 1")
    2, 3 -> println("this is 2 or 3")// 복수 인정 가능
    else -> println("this is else")
}

- 아래의 when의 경우는 값을 만들어 내기 때문에 Expression임
var b = when (score) {
    1 -> 1
    2 -> 2
    else -> 3
}

- 코틀린의 모든 함수는 Expression임. return type이 없어도 사실은 Unit을 리턴하기 때문,
반면에 Java의 void 리턴 타입의 함수는 Statement가 맞다.

 */


/* 5. Array Vs. List

- Array : 사이즈가 미리 정해져있음, 값을 변경하는 것은 가능 (mutable)

- List : 사이즈는 동적할당. List이냐 MutableList이냐에 따라 값 변경에 대한 제약이 있음
    - 1. List (Immutable) : 값 변경 불가능, 읽기 전용
    - 2. MutableList  : 값 변경 가능

 */

fun array() {
    val array = arrayOf(1, 2, 3) //  참조값 자체는 안 바뀌기 때문에 value.
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 0.3) // Array<Any>
    val list2 = listOf(1, "d", 0.3)

    array[0] = 3 // array 값 변경 가능
//    list [0] = 2 // 에러. 값 변경 불가능
    val result = list.get(0) // List는 interface이므로 get으로 접근에서 읽기만 사용

    // MutableList의 대표적인 예: ArrayList
    val arrayList = arrayListOf<Int>()
    arrayList.add(2)
    arrayList.add(3)
    arrayList.add(4)
    arrayList[0] = 20
}

// 6. 반복문 for, while
fun forAndWhile() {

    // for문
    val students = arrayListOf("Kim", "Lee", "Park")

    for (name in students) {
        println("name: ${name}")
    }

    // 인덱스와 함께 사용하기
    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 학생 : ${name}")
    }

    var sum: Int = 0
//    for (i in 1..10 step 2) { // i = 1, 3, 5, 7, 9
//    for (i in 10 downTo 1) { // i = 10, 9, 8, ... , 1
    for (i in 1 until 100) { // i = 1 ~ 99. 100은 포함하지 않는다.
        sum += i
    }
    println(sum)

    // while문
    var index = 0;
    while (index < 10) {
        print("${index} ")
        index++
    }
}