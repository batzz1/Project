import java.util.*

/** FInd all sub arrays with given sum
 * arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
 * [3, 4]
 * [3, 4, -7, 1, 3, 3]
 * [1, 3, 3]
 * [3, 3, 1]
 */
object SubArray {
    // Utility function to print the sub-array arr[i,j]
    fun print(arr: IntArray, i: Int, j: Int) {
        val list: MutableList<Int> = ArrayList()
        val bound = j + 1
        for (k in i until bound) {
            val integer = arr[k]
            list.add(integer)
        }
        println(list)
    }

    // Function to find sub-arrays with given sum in an array
    fun findSubarrays(arr: IntArray, sum: Int) {
        for (i in arr.indices) {
            var sum_so_far = 0

            // consider all sub-arrays starting from i and ending at j
            for (j in i until arr.size) {
                // sum of elements so far
                sum_so_far += arr[j]

                // if sum so far is equal to the given sum
                if (sum_so_far == sum) {
                    print(arr, i, j)
                }
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 4, -7, 1, 3, 3, 1, -4)
        val sum = 7
        findSubarrays(arr, sum)
    }
}