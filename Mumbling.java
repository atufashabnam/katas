// DESCRIPTION:

// This time no story, no theory. The examples below show you how to write function accum:

// Examples:

// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.


// SOLUTION


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {
    
    public static String accum(String s) {
     // your code
      return IntStream.range(0, s.length())
                .mapToObj(i -> {
                    char a = s.charAt(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Character.toUpperCase(a));
                    IntStream.range(0, i)
                            .forEach(j -> sb.append(Character.toLowerCase(a)));
                    return sb.toString();
                })
                .collect(Collectors.joining("-"));
    }
}