import java.util.*

fun main(args:Array<String>) {
    var obj=SportsDetails()
    println("Enter your name:")
    val name = readLine()
    println()
    println("list of sports:")
    val arrayList = ArrayList<String>()
    arrayList.add("-->Badminton")
    arrayList.add("-->Football")
    arrayList.add("-->Box cricket")
    for(list in arrayList){
        println(list)
    }
    while (true) {
        var scanner = Scanner(System.`in`)
        println("please select which sport you want to book:1-Badmiton,2-football,3-cricket")
        var num1 = scanner.nextInt()
        when (num1) {
            1 -> {
                obj.Badmiton()
            }
            2 ->{
                obj.Football()
            }
            3 ->{
             obj .cricket()
            }
            else ->"please select valid sport number"

        }
    }
}
