fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
} // 3

fun main() {
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("mulResult $mulResult")
}