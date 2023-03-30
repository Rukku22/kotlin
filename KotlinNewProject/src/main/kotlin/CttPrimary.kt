class CttPrimary(id: Int, name: String) {

    constructor(carname: String,price: Int,name:String,id:Int) : this(id,name) {
        println("primary ctt and secondary ctt.....")
        println("id=${id}")
        println("name=${name}")
        println("car= ${carname}")
        println("price = ${price}")

    }

    }


fun main(args:Array<String>){
     val v =CttPrimary("benz",10000,"rukku",1987)

}