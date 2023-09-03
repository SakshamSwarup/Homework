fun main (){

println("This is a Fibonacci Number. ")

var x = 0
var y = 1
var c = 0

for (i in 0..20){

    c = x + y
    y = x
    print(" $x")
    x = c



}


}