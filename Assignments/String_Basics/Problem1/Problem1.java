/** 
  PROBLEM 1:

  Given a String with spaces in between, remove all of the spaces.
  Example: String str = "8 j 8   mBliB8g  imjB8B8  jl  B";
  Result: "8j8mBliB8gimjB8B8jlB"

  Create a method or a function that that given a string, 
  returns that string without spaces.
 */

 public class Problem1 {
   public static void main(String[] args){
     String str = "8 j 8   mBliB8g  imjB8B8  jl  B";
     String result = str.replaceAll(" ", "");
     System.out.println(result);
   }
 }