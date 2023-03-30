open class Bird {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}
interface Duck {
    fun fly() {
        println("Duck is flying...")
    }
}
class Parrot: Bird(),Duck {
    override var color = "Green"
    override fun fly() {
        super<Bird>.fly()
        super<Duck>.fly()
        println("Parrot is flying...")

    }
}
fun main(args: Array<String>) {
    val p = Parrot()
    p.fly()
    println(p.color)

}