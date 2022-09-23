
    fun main(args: Array<String>) {
        val input= readLine()!!
        println(validation(input))
    }
    fun validation(str:String):String{
        if(str.length >25||str.length<4 || Character.isLetter(str.get(0))==false || str.get(str.length-1)=='_'){
            return "false"
        }else{
            for(i in str.length-1..0){
                if(Character.isLetter(str.get(i)) || Character.isDigit(str.get(i)) || str.get(i)=='_'){
                    continue
                }else{
                    return "false"
                }
            }
        }
        return "true"
    }
