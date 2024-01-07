//Q1 find the greastest value of given array

fun main() {
//grestevaluate()
//greatsum()
//merge()
findcommon()

}

fun grestevaluate(){

    val arr = arrayOf(1, 23, 3, 54, 75, 100,89)
    arr.sort()
    val greastest = arr.last()
    println("$greastest")

}
// Q2 find the sum of greastest value of given array
fun greatsum(){

    val arr = arrayOf(1, 23, 3, 54, 75, 100,89)
    arr.sortDescending()
    val last = arr[0]
    val secondlast = arr[1]
    println(last + secondlast)

}

//Q3 Merge the array

fun merge(){

    val arr = arrayOf(1, 23, 3, 54, 75, 100)
    val arr2 = arrayOf(23,112,323,)

    val arr3 = arr + arr2
   arr3.forEach{ println(it) }

}

fun findcommon() {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(3, 4, 5, 6, 7)

    val commonvalues = ArrayList<Int>()

    for (i in array1) {
        for (j in array2) {
            if (i == j) {
                commonValues.add(i)
                break
            }
        }
    }
    println(" Values: $commonvalues")
}
