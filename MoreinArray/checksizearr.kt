fun main(){
 val arr = arrayOf(12,23,44,55,66)
 val length = arr.size
 val count = arr.count()
 arr.set(0, 322)
println(count)
println(length)

// Best Method to iterate array.
arr.forEach{
    println(it)
    }
val random = arrayOf(12,32,1,7,98,56,885)
random.sort()
for (i in random) {
    println(i)
}

}

