/*

There are two types of Polymorphisms 
1. Compile Time Polymorohim. 
2. Runtime Time Polymorphism.
*/
import java.math.BigDecimal
fun main() {

var calc1 = calc()
 calc1.add(BigDecimal("5.7"), BigDecimal("6.6")) 
}

/*
Compile time polymorphism. This also know as Method of overloading.
 */

 class calc()  {
    fun add(a:Int , b:Int){
        print(a+b)    
    }
    fun add(a:BigDecimal ,b:BigDecimal ){

        print(a+b)
    }


 }