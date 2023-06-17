// DESCRIPTION:

// Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

// It should remove all values from list a, which are present in list b keeping their order.

// Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
// If a value is present in b, all of its occurrences must be removed from the other:

// Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}



// SOLUTION

import java.util.ArrayList;
import java.util.List;
public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
    List<Integer> result = new ArrayList<>();
    int resIndex = 0;
    for(int i=0; i<a.length; i++){
      int index=-1;
      for(int j=0; j<b.length; j++ ){
        if(a[i]==b[j]){
          index = j;
        }
      }
      if(index == -1){
        result.add(a[i]);
      }
    }
    int[] finalRes = new int[result.size()];
    for(int i=0; i< result.size(); i++){
      finalRes[i]= result.get(i);
    }
    return finalRes;
  }

}