val a = 5
val b = 6

fun main() {
    val condition = a == b
    println(unless2(condition) {it*4})

}

fun unless2(condition: Boolean, code: (Int) -> Int): String {
    if (condition)
        return "площадь = ${code(a)}"
    else
        return ("Это не квадрат")
}