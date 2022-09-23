import java.util.Scanner

fun main() {
    var scanner=Scanner(System.`in`)
    var input=scanner.nextLine()
    print(questionsMarks(input))

}
private fun questionsMarks(str: String): String {
    var count=0
    var lastdigit=0
    var result="false"
    for(char in str){
        if(char.isDigit()){
            var digit=Integer.valueOf(char.toString())
            var sum=digit+lastdigit
            lastdigit=digit
            if(sum!=10){
                count=0
                continue
            }

            result=if(count==3){
              return  "true"
            }
            else{
               return "false"
            }
        }else if(char=='?')
            count++

    }
    return result
}