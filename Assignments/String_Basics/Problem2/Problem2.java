
/** 
  PROBLEM 2:

  We need a function that can transform a string into a number. 
  Example: 
    stringToNumber("1234") == 1234
    stringToNumber("605" ) == 605
    stringToNumber("1405") == 1405
    stringToNumber("-7"  ) == -7

    Create a method or a function that takes a string a parameter and 
    returns a number.
 */

 public class Problem2 {
   public static void main(String[] args) {
     String number1 = "1234";
     int result = Integer.parseInt(number1);
     System.out.println(result);
   }
 }