// DESCRIPTION:

// Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

// Examples

// "the-stealth-warrior" gets converted to "theStealthWarrior"

// "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

// "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

// SOLUTION

import java.lang.StringBuilder;
class Solution{

   static String toCamelCase(String s){
    StringBuilder builder = new StringBuilder();
    boolean specialCharacterPresent = false;
    for(int i=0; i<s.length(); i++){
      String holder = Character.toString(s.charAt(i));
        if(holder.equals("-") || holder.equals("_")){
          specialCharacterPresent = true;
        }else {
          if(specialCharacterPresent){
            builder.append(holder.toUpperCase());
            specialCharacterPresent = false;
          }else{
                  builder.append(holder);
          }
        }
    }
    return builder.toString();
  }
}