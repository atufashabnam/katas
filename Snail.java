// DESCRIPTION:

// Snail Sort

// Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

// array = [[1,2,3],
//          [4,5,6],
//          [7,8,9]]
// snail(array) #=> [1,2,3,6,9,8,7,4,5]
// For better understanding, please follow the numbers of the next array consecutively:

// array = [[1,2,3],
//          [8,9,4],
//          [7,6,5]]
// snail(array) #=> [1,2,3,4,5,6,7,8,9]


// NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

// NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].


// SOLUTION


import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {
        List<Integer> result = new ArrayList<>();

        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        int n = array.length;
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
         
            for (int i = colStart; i <= colEnd; i++) {
                result.add(array[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(array[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(array[rowEnd][i]);
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(array[i][colStart]);
                }
                colStart++;
            }
        }

        int[] snailArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            snailArray[i] = result.get(i);
        }

        return snailArray;
    }
}