/*
    8. 코틀린 클래스
 */

package com.preferkim.kotlin_syntax

/* 코틀린 클래스의 특징

- 파일명과 클래스명이 달라도 괜찮다.
- 한 파일에 여러 클래스 선언 가능함.
- 코틀린 클래스는 기본적으로 final 클래스임, 상속하려면 부모 클래스에 open 키워드를 붙인다.

 */
//class Human constructor(val name: String) { // 클래스의 인스턴스 필드로 name(String) 을 갖는다!!!
//class Human(val name: String) { // constructor키워드는 생략이 가능하다.
open class Human(val name: String = "Anonymous") { // 생성자에서 디폴트 값을 주는 경우

    /* Java

    class Person {

        public Person(String name) { // 주 생성자
            ...
        }

        public Person(String name, int age) { // 부 생성자
            ....
        }

     */

    // 코틀린의 부 생성자
    constructor(name: String, age: Int) : this(name) { // 주 생성자로부터 name을 받아와야한다.
        println("My Name is ${name}, ${age}years old.")
    }

    init { // 인스턴스를 생성할 때 맨 처음 실행되는 블럭, 주 생성자의 일부
        println("New human has been born!!!")
    }

    fun eatingCake() {
        println("Yummy!")
    }

    open fun singASong() { // 자식 클래스에서 override하기 위해 open으로 선언
        println("I'm singing~ lalala")
    }
}


fun main() { // Entry main 함수

    val human = Human("joyce") // Human인스턴스 생성. 이 때 Java와 달리 new키워드를 사용하지 않는다.

    val dev = Human("Dev") // Human.name의 값은 "Dev"
    val stranger = Human() // 생성자에 디폴트 값이 있기 때문에, 생성자의 매개변수를 쓰지 않을 수도 있다.

    val somebody00 = Human("somebody00", 0)

    human.eatingCake()

    println("this human's name is ${human.name}")
    println("dev's name is ${dev.name}")
    println("stranger's name is ${stranger.name}")
}