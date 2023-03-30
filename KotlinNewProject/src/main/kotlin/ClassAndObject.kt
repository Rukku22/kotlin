import java.util.Scanner

class ClassAndObject {
    var name: String = ""
    var acc_no: Int = 0
    var country: String = ""
    fun insert(a: Int, n: String, c: String) {
        var scanner = Scanner(System.`in`)
        while (true) {

            println("enter your name")
            val name = scanner.next()
            println("enter acount number")
            var acc_no = scanner.nextInt()
            println("enter country")
            var country = scanner.next()
            println("success")
        }

    }
}
