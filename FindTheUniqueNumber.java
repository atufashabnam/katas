// DESCRIPTION:

// There is an array with some numbers. All numbers are equal except for one. Try to find it!

// Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
// Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
// It’s guaranteed that array contains at least 3 numbers.

// The tests contain some very huge arrays, so think about performance.

// This is the first kata in series:

// Find the unique number (this kata)
// Find the unique string
// Find The Unique

// SOLUTION


public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
  double uniqueNumber = 0;
        boolean foundUnique = false;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueNumber = arr[i];
                foundUnique = true;
                break;
            }
        }
        if (!foundUnique) {
            throw new RuntimeException();
        }

        return uniqueNumber;
    }
 }