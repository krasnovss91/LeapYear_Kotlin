import java.util.*

//программа, проверяющая, является ли год високосным или нет
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val year = scan.nextInt()
    var b: Boolean = false

    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        b = true
    else
        b = false

    println(b)
}