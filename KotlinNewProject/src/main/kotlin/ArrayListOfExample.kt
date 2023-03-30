fun main(args: Array<String>){

    var intArrayList: ArrayList<Int> = arrayListOf<Int>(1,2,3)
    var stringArrayList: ArrayList<String> = arrayListOf<String>("Ajay","Vijay","Prakash")
    var anyArrayList: ArrayList<Any> = arrayListOf<Any>(1,2,3,"Ajay","Vijay","Prakash")
    println("print int ArrayList")
    for(element in intArrayList){
        println(element)
    }
    println()
    println("print string ArrayList")
    for(element in stringArrayList){
        println(element)
    }
    println()
    println("print any ArrayList")
    for(element in anyArrayList){
        println(element)
    }
    var itr=anyArrayList.iterator()
    while (itr.hasNext())
        println(itr.next())
    println("name:"+ stringArrayList.get(2))
    stringArrayList.set(0,"charan")
    println("change name:"+stringArrayList)


}