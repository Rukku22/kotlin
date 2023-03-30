data class DataExample(var id:Int,var name:String){

    }

fun main(args:Array<String>){
    println("it consist internally tostring method....")
    println()
    var obj=DataExample(123,"ruksana")
    var obj1=DataExample(123,"ruksana")
    println(obj)
    println()
    println("example of hascode method")
    println()
    println(obj==obj1)
    println(obj.equals(obj1))
     println()
    println("copy method example....")
    println()
    var obj3=DataExample(456,"charan")
    var obj4=obj3.copy(id = 1987)
    println(obj4)
      }
