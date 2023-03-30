 abstract  class Vehicle{

     abstract  fun car()
     abstract fun  ride()
     abstract  fun start()
 }
 open class Benz:Vehicle(){
     var cost:Int=100000
     override fun car() {
 println("this is benz car...")
      }

     override fun ride() {
 println("it is best to riding")
      }

     override fun start() {
          println("benz starts...")
     }

     open fun price(){
      println("benz price is ${cost} ")
  }


 }
 class Honda:Benz(){
     var price=7000000

     override fun price(){
         println("honda price is ${price}")
     }
     override fun car() {
         println("this is honda car...")
     }
 }
 fun main(args:Array<String>){
     val obj1=Benz()
     obj1.price()
     obj1.car()
     val obj2=Honda()
     obj2.price()
     obj2.car()
 }