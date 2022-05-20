package chap02.section2

fun main() {
    println("Byte min: " + Byte.MIN_VALUE + " Max: " + Byte.MAX_VALUE)
    println("Short min: " + Short.MIN_VALUE + " Max: " + Short.MAX_VALUE)
    println("Int min: " + Int.MIN_VALUE + " Max: " + Int.MAX_VALUE)
    println("Long min: " + Long.MIN_VALUE + " Max: " + Long.MAX_VALUE)
    println("Float min: " + Float.MIN_VALUE + " Max: " + Float.MAX_VALUE)
    println("Double min: " + Double.MIN_VALUE + " Max: " + Double.MAX_VALUE)

    var num: Double = 0.1
    var num2 : Float = 0.1F

    for (x in 0..999   ){
        num += 0.1
        num2 += 0.1F
    }
    println(num)
    println(num2 )
}