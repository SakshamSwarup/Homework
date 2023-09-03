var arr = arrayOf(1, 8, 7, 5)

for (i in 0 until arr.size - 1) {
    var smallestIndex = i
    for (j in i + 1 until arr.size) {
        if (arr[smallestIndex] > arr[j]) {
            smallestIndex = j
        }
    }

    var temp = arr[smallestIndex]
    arr[smallestIndex] = arr[i]
    arr[i] = temp
}
print(arr)