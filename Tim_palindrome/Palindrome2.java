import java.util.Scanner;

public class Palindrome2{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:   ");
        String str = scan.nextLine();
        System.out.println("Your entered:   " + str);
        String reverseString = "";
        scan.close();

        for (int i = str.length()-1; i >= 0; i--){
            reverseString = reverseString + str.charAt(i);
        }

        if(str.equals(reverseString))
            System.out.println(str + "   Is a palindrome!");
        
        else
            System.out.println(str + "   Is not a palindrome.");
        
    }
}





                        