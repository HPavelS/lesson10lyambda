fun main() {
    val options = arrayOf("Red", "Amber", "Green")
    var crossWalk = options[(Math.random() * options.size).toInt()]
    for (i in 1..10) {
        if (crossWalk == "Green") {
            println("Walk! $i")
            break
        }
        crossWalk = options[(Math.random() * options.size).toInt()]
    }
    unless (crossWalk == "Green") {
        println("Stop!")
    }
}

fun unless(condition:Boolean,  code: () -> Unit){
    if (!condition)
        code()
}