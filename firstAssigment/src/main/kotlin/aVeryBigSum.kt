import java.util.*

fun main(){
    val scan= Scanner(System.`in`)
    val ar=scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    println(secondAssigment(ar))
}

fun secondAssigment(ar:Array<Int>): Long {
    var sum:Long=0
    var result: Long =ar.sum().toLong()
    return result
}