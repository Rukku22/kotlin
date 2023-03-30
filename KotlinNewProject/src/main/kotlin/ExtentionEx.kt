class ExtentionEx {
    fun add() {
        var v1 = 10
        var v2 = 20
        var result = v1 + v2
        println("result of addition:${result}")
    }

}
fun ExtentionEx.sub(){
    var v3=70
    var v4=50
    var v5=10
    var result=v3-v4+v5
    println("result of substraction:${result}")
}
fun main(args:Array<String>){
    val add=ExtentionEx()
    add.add()
    add.sub()

}