import java.util.Scanner;

public class Palindrome{
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the word or number: ");
        String str = userInput.nextLine();
        System.out.println("Your input was: " + str);

        String reverseString = new StringBuffer(str).reverse().toString();

        if (str.equals(reverseString)){
            System.out.println("The input word is PALINDROME!!!!");
        }
        else {
            System.out.println("The input Word is not a Palindrome!!!!!");
        }
    }
}