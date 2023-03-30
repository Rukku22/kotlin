sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int,var height:Int): Shape()
}
fun result(e:Shape){
    when(e){
        is Shape.Circle-> println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square ->println("Square area is ${e.length*e.length}")
        is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")
     }


}
fun main(args:Array<String>){
    var circle=Shape.Circle(4.0F)
    var square=Shape.Square(5)
    var rectangle=Shape.Rectangle(2,3,5)
    result(circle)
    result(square)
    result(rectangle)
}