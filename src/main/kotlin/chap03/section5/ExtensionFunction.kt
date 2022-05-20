package chap03.section5


//확장함수...

fun main() {
    val source = "hello world"
    val target = "kotlin"
    println(source.getLongString(target))
    // 중위 표현법
    //infix 로 함수 선언해야함
    println(source getLongString target)

}

infix fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target