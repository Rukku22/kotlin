open class Inheritane1 {
    open var name:String="ruksana"
    var age:Int=22
    var salary:Float= 100000.0F
    open fun m1(){
        println("m1 is executed")
    }
}
class Employee:Inheritane1(),salary{
    override var name:String="charan"
    override fun m1(){
        super<Inheritane1>.m1()

        println("mention name of frd ${name}")
    }
    override fun main(){
        super<salary>.main()
         println("override interface.....")
    }
  }
interface salary{
    fun main(){
        println(" interface. started.....")
    }
}
fun main(args:Array<String>){
    var obj1=Inheritane1()
    obj1.m1()
    var obj2=Employee()
    obj2.m1()
    obj2.main()
}