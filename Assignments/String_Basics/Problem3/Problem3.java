/** 
  PROBLEM 3:

  Write a function to convert a name into initials. Assume you always get 
  first and last name.
  Example: String name = "Shamsiddini Ziyovuddin";
  The output should be two capital letters with a dot seperating them.
  It should look like this:
    Sam Harris => S.H
    Patrick Feeney => P.F
 */

public class Problem3 {
  public static void main(String[] args){
    String name = "Shamsiddini Ziyovuddin";
    // executes methodOne code
    methodOne(name);
    // executes methodTwo code
    methodTwo(name); 

  }

  public static void methodOne(String str){
    int index = str.indexOf(" ");
    System.out.println(str.charAt(0) + "." + str.charAt(index + 1));
  }

  public static void methodTwo(String name){
    String[] names = name.split(" ");
    // Output: ["Shamsiddini", "Ziyovuddin"]

    String firstName = names[0];
    String lastName = names[1];

    System.out.println(firstName.charAt(0) + "." + lastName.charAt(0));
  }
}