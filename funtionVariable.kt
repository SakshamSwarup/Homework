import kotlin.math.*

fun main (){
 var p = ::power

println(p(5,3))


}



fun power(a:Int,b:Int):Int{
    var c = a.toDouble().pow(b)
    return c.toInt()
}
