fun main (){

println("This is a Fibonacci Number. ")

var a = 0
var b = 1
var sum = 0

for (i in 0..12){

a = b
b = sum
sum = a + b

print(" $b")


}


}