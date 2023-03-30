import java.util.*
import kotlin.collections.HashMap

class SportsDetails {
    fun Badmiton() {
        var hashMap: HashMap<Int, String> = HashMap<Int, String>()

        hashMap.put(1, "10:00 am-11:00 am");
        hashMap.put(2, "11:00 am-12:00 am");
        hashMap.put(3, "12:00 pm-01:00 pm");
        hashMap.put(4, "02:00 pm-03:00 pm");
        hashMap.put(5, "03:00 pm-04:00 pm");
        hashMap.put(6, "04:00 pm-05:00 pm");
        hashMap.put(7, "05:00 pm-06:00 pm");
        hashMap.put(8, "06:00 pm-07:00 pm");
        hashMap.put(9, "07:00 pm-08:00 pm");
        hashMap.put(10, "08:00 pm-09:00 pm");
             var scanner = Scanner(System.`in`)
            println("available slots and timings:")

            for (key in hashMap.keys)
                println("slot:$key time: ${hashMap[key]}")
                    println("enter your booking single slot number")
                    var n1 = scanner.nextInt()
                    println("your slot number:$n1")
                    println("slot booked successfully ")
                    hashMap.remove(n1);
                    if (n1 <= 10) {
                    } else {
                        println("please entr 1-10 slots number only")
                     }
                    println("thank you for booking slot")
                    if (hashMap.size == 0) {
                        println("slots are already booked")
                    }

                }
    fun Football(){
        var  football:HashMap<Int,String> = HashMap<Int,String>()
        football.put(1,"10:00 am-10:30 am");
        football.put(2,"10:30 am-11:00 am");
        football.put(3,"11:00 am-11:30 am");
        football.put(4,"11:30 am-12:00 am");
        football.put(5,"01:30 pm-02:00 pm");
        football.put(6,"02:30 pm-03:00 pm");
        football.put(7,"03:00 pm-03:30 pm");
        football.put(8,"04:00 pm-04:30 pm");
        football.put(9,"04:30 pm-05:00 pm");
        football.put(10,"05:00 pm-05:30 pm");
        football.put(11,"06:00 pm-06:30 pm");
        football.put(12,"06:30 pm-7:00 pm");
        football.put(13,"07:00 pm-07:30 pm");
        football.put(14,"07:30 pm-08:00 pm");
        football.put(15,"08:00 pm-08:30 pm");
        football.put(16,"08:30 pm-09:00 pm");
        football.put(17,"09:00 pm-09:30 pm");
        football.put(18,"09:30 pm-10:00 pm");
        football.put(19,"10:00 pm-10:30 pm");
        football.put(20,"10:30 pm-11:00 pm");
        var scanner = Scanner(System.`in`)
        println("available slots and timings:")
        for (key in football.keys)
            println("slot:${key}time:${football[key]}")
        println("enter your booking single slot number")
        var n1 = scanner.nextInt()
        println("your slot number:$n1")
        println("slot booked successfully ")
        football.remove(n1);
        if (n1 <= 10) {
        } else {
            println("please entr 1-10 slots number only")
        }
        println("thank you for booking slot")
        if (football.size == 0) {
            println("slots are already booked")
        }

    }
    fun cricket(){
        var box:HashMap<Int,String> = HashMap<Int,String>()
        box.put(1,"10:00 am-12:00 am");
        box.put(2,"02:00 pm- 04:00 pm");
        box.put(3,"04:00 pm- 06:00 pm");
        box.put(4,"06:00 pm- 08:00 pm");
        box.put(5,"08:00 pm- 10:00 pm");
        var scanner = Scanner(System.`in`)
        println("available slots and timings:")

        for (key in box.keys)
            println("slot:$key time: ${box[key]}")
        println("enter your booking single slot number")
        var n1 = scanner.nextInt()
        println("your slot number:$n1")
        println("slot booked successfully ")
        box.remove(n1);
        if (n1 <= 10) {
        } else {
            println("please entr 1-10 slots number only")
        }
        println("thank you for booking slot")
        if (box.size == 0) {
            println("slots are already booked")
        }

    }
            }



