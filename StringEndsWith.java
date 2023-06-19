// DESCRIPTION:

// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

// Examples:

// solution('abc', 'bc') // returns true
// solution('abc', 'd') // returns false



// SOLUTION

public class StringEndsWith {
  public static boolean solution(String str, String ending) {
    if((str.length() - ending.length()) < 0){
      return false;
    }
    String a = str.substring(str.length() - ending.length());
    if(a.equals(ending)){
      return true;}
    return false;
  }
}
