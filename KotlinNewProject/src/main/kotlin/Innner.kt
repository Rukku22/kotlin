class Innner{
    private  var name: String = "ruksana"
    private var registerno:Int=123
    private var mobile_no:Int=12456768
    inner class  innerClass{
        var discription:String="innerclass discription..."
          fun foo(){
            println("name : ${name}") // access the outer class member even private
            println("reg.No: ${registerno}")
              println("moblieNo:${mobile_no}")
        }
    }
}
fun main(args: Array<String>){
    println(Innner().innerClass().discription) // accessing property
    var obj = Innner().innerClass() // object creation
    obj.foo() // access member function

}