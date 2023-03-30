fun main(args: Array<String>) {
    for (i in 1..3) {
        println("i = $i")
        if (i == 2) {
            continue
        }
        println("this is below if")
    }
}  