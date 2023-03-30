fun main(args: Array<String>){

    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("Ajay")
    list.add("Vijay")
    list.add("Prakash")

    arrayList.addAll(list)
    println("......print ArrayList......")
    val itr = arrayList.iterator()
    while(itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList = "+arrayList.size)
    println("name:"+arrayList[3])
    println("index of name:"+arrayList.indexOf("vijay"))
    println(arrayList.lastIndexOf("Vijay"))
    arrayList.remove("Vijay")
    arrayList.removeAt(3)
    arrayList.clear()


}