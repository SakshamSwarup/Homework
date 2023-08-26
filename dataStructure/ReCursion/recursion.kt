fun main() {
    
    //  downto5(5)
    //  println(sum_NaturalNum(5))

    // val a = 0
    // val b = 1
    // val n = 7
    
    // println(a) // Print the first number in the series
    // println(b) // Print the second number in the series
    
    // fibonacciNum(a, b, n - 2) // Subtract 2 from n to account for the first two numbers
    println(calPower(2 , 5))



}

fun downto5(a: Int) {
          if (a <= 0) {
             return    // Stops the funtions     
     }
      println(a)
      downto5(a - 1)   // Funtion Returning & calling the function
 }

 fun sum_NaturalNum(i:Int):Int{
         if (i<=0){
             return 0
     }
  return i + sum_NaturalNum(i-1)

}


fun fibonacciNum(a: Int, b: Int, n: Int) {
    if (n <= 0) {
        return
    }
    
    val c = a + b
    println(c)
    
    fibonacciNum(b, c, n - 1)
}


fun calPower(x:Int , y:Int):Int{
    if(y==0){
        return 1

    }
     if (x==0){
        return 0
    }

    val slackHeight1 = calPower(x, y-1)
    val finalHeight = x * slackHeight1
    
    return finalHeight

}

