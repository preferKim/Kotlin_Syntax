package com.preferkim.kotlin_syntax

// 코틀린의 상속
class Korean : Human() { // cf. class Korean extends Human

    // 오버라이딩
    override fun singASong() { // singASong' in 'Human' is final and cannot be overridden -> singASong()에 open키워드 붙임
        super.singASong() // 부모 클래스의 singASong() 호출
        println("한국인이 부릅니다. 라라라~ ")
        println("노래 부르는 사람 : ${name}")
    }

}

fun main() {

    val korean00 = Korean()

    korean00.singASong()

}

/* 실행 결과

New human has been born!!!
I'm singing~ lalala
한국인이 부릅니다. 라라라~
노래 부르는 사람 : Anonymous

 */