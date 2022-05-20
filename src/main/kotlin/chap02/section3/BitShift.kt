package chap02.section3

fun main() {
    val num = -4  // 0100 -> 0001 0000 왼쪽으로 2간이동 부호비트 유지

    println(num.shl(2))  //*2
    println(num shl 2) // 중위 표현법(infix)

    println(num.shr(2))  //0100 -> 0001   // /2
    println(num shr 2) // 중위 표현법(infix)
    println(num.ushr(2)) //부호비트 유지하지않음


    var x = 4
    var y = 0b0000_1010  // 10진수 10
    var z = 0x0F         // 10진수 15

    println("x shl 2 -> ${x shl 2}")  //16
    println("x.inv -> ${x.inv()}")      //-5

    println("y shr 2 -> ${y / 4}, ${y shr 2}")      // y shr 2 -> 2, 2
    println("x shl 4 -> ${x * 16}, ${x shl 4}")     // x shl 4 -> 64, 64
    println("z shl 4 -> ${z * 16}, ${z shl 4}")     // z shl 4 -> 240, 240

    x = 64
    println("x shr 4 -> ${x / 4}, ${x shr 2}")      // x shr 4 -> 16, 16

    val number1 =5  //0101
    val number2 = -5   // 1111....1011

    println(number1 shr 1)
    println(number1 ushr 1)  //변화없음
    println(number2 shr 1)   // 부호 비트가 1 로 유지
    println(number2 ushr 1)  // 부호 비트가 0이 되면서 변경


    val number3 = 12 //1100
    val number4 = 25
    val result: Int
    result = number3 or number4  //result = number3.or(number4)와 동일
    println(result)
}