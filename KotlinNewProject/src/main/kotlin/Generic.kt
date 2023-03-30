class Generic<T>(var name:T) {

    init{
        this.name=name
        println(name)
    }


}
fun main(args:Array<String>){
    var v1=Generic(123)
    var v2=Generic("rukku")
    var v3=Generic(2.0)
}