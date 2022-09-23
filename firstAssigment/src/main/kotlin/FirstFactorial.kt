import java.util.Scanner

fun main(){
        var scanner = Scanner(System.`in`)
        var input = scanner.nextInt()
        println(firstFactorial(input))
}

private fun firstFactorial(num: Int): Int {
    var result=1
    for(i in num downTo 1)
        result*=i
    return result
}