package chap03.section3

fun main() {
    val result: Int
    val multi = { x: Int, y: Int ->
        println("x*y")
        x * y
    }
    val multi2: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
    val multi3 = { x: Int, y: Int -> x * y }
    val greet: () -> Unit = { println("Hello") }
    val nestedLambda: () -> () -> Unit = { { println("world") } }
    val nestedLambda1: () -> () -> Int = { { 20 } }
    result = multi(10, 10)
    println(result)
    println(greet)
    greet()
    println(nestedLambda)
    nestedLambda()()
    val test = nestedLambda1()()
    println(test)
}