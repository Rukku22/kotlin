fun main(args: Array<String>){
    var number = 8
    when(number) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }
}  