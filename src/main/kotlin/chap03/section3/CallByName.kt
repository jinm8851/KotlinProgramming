package chap03.section3

fun main() {
// 람다식이 값으로 전달했을경우(함수처럼) 함수처럼 호출되서 내용물을 가져온다
//람다식이 이름 만으로 호출할경우는 해당이름이 람다식자체가 복사가 되서 람다식이 사용되는 시점에서 작동한다
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: ()->Boolean):  Boolean {
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda funtion")
    true
}

