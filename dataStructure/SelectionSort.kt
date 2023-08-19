fun main(){

//var arr = arrayOf(1, 8, 7 ,5 )


/*for (i in 0 until arr.size - 1) {
    
    var smallestIndex = i
    for (j in i+1 until arr.size) {
        if (arr{smallestIndex} > arr[j]{

            smallestIndex = j 
        }
        
        )

        var temp = arr[smallestIndex]
        arr[smallestIndex] = arr[i]
        arr[i] = temp  


    }

    print(arr)
*/
var arr = arrayOf(1, 8, 7, 5)    // Array of List

for (i in 0 until arr.size) {     // Outer Loops iterates through each element in the Array.
    var smallestIndex = i         // This variable keep track of index.
    for (j in i + 1 until arr.size) {    //  It is used to compare the current element with the remaining elements in the array. It starts from i + 1 because we have already compared and potentially swapped elements before i.
        if (arr[smallestIndex] > arr[j]) {  // Compares the values.
            smallestIndex = j               // Smallest index updated to j. 
        }
    }

    var temp = arr[smallestIndex]    // Temparory value
    arr[smallestIndex] = arr[i]      // Swap the values of arr[smallestIndex] and arr[i]. This ensures that the smallest element is moved to its correct position in the sorted part of the array.
    arr[i] = temp                    // Update array [i] 
}

print(arr.contentToString())





}
