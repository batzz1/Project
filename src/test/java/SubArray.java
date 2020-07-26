import java.util.ArrayList;
import java.util.List;

/** FInd all sub arrays with given sum
 * arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
 * [3, 4]
 * [3, 4, -7, 1, 3, 3]
 * [1, 3, 3]
 * [3, 3, 1]
 */
public class SubArray {
    // Utility function to print the sub-array arr[i,j]
    public static void print(int[] arr, int i, int j)
    {
        List<Integer> list = new ArrayList<>();
        int bound = j + 1;
        for (int k = i; k < bound; k++) {
            Integer integer = arr[k];
            list.add(integer);
        }
        System.out.println(list);
    }

    // Function to find sub-arrays with given sum in an array
    public static void findSubarrays(int[] arr, int sum)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int sum_so_far = 0;

            // consider all sub-arrays starting from i and ending at j
            for (int j = i; j < arr.length; j++)
            {
                // sum of elements so far
                sum_so_far += arr[j];

                // if sum so far is equal to the given sum
                if (sum_so_far == sum) {
                    print(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int sum = 7;

        findSubarrays(arr, sum);
    }
}
