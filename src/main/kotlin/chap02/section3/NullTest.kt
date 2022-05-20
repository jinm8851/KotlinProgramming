package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    var num: Int? = null
 //   str1 = null
    val len = if (str1 != null) str1.length else -1

    println("str1: $str1 , num: $num")
    println("str1: $str1 , length: ${str1?.length}")
//    println("str1: $str1 , length: ${str1!!.length}")
    println("str1: $str1 , length: ${len}")

    println("str1: $str1 , length: ${str1?.length ?: -1}") //?: 연산자 널인경우 -1 아닌경우 랭스 반환 위 이프문과같음

}

/*
세이프콜(Safe-call) { str1?.length } 널인경우 null을 반환하고 아닌경우 실행

non-null 단정기호 { str1!!.length } 널이 아니라고 단정해놓음
*/
