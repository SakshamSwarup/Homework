fun main (){

var arr = arrayOf(7, 5, 6, 3)

// Bubble Sort
var temp = 0

for (i in 0 until arr.size - 1) {   // outer loops controls no. of passes needed to sort the array.
    for (j in 0 until arr.size - i - 1) // loops controls adjacnent elements swap them of available.
{
        if (arr[j] > arr[j + 1]) {
            temp = arr[j]           // temp will store index if arr[j].
            arr[j] = arr[j + 1]     // arr [j] will swap to arr[j+1]. 
            arr[j + 1] = temp       // arr [j + 1]  swap to arr[j] position because its temp hold if arr[j]. 
        }
    }
}

for (i in arr) {
    print("$i ")
}

//Dry Run 

/*

 for  i = 0  5 6 3 7
      i = 1  5 3 6 7
      i = 2  3 5 6 7

*/






}