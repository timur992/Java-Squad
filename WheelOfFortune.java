import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class WheelOfFortune{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            String[] words = { "variable", "function", "object", "expression", "plus", "pattern", "module",
                "debug", "integrated", "development", "environment", "virtual", "input", "shift", "constructor",
                "destructor", "syntax", "iterate", "procedure", "compiler" };
            int maxNumberOfGuesses = 10;
            int maxTime = 0;
            String guessLetter = "";

            String secretWord = getSecretWord(words);
            

            System.out.println(secretWord);
            
            if(secretWord.length() * 2 >= maxNumberOfGuesses){
                maxNumberOfGuesses = secretWord.length() * 2;
            }
            System.out.println(maxNumberOfGuesses);

            maxTime = secretWord.length() * 7 > 40 ? secretWord.length() * 7 * 1000 : 40 * 1000;

            String underScores = "";

            
            for (int i = 0; i < secretWord.length(); i++){
                underScores+= "_";
            }


            long startTime;
            long endTime;
            ArrayList<Character> storeUserGuess = new ArrayList<Character>();
            int numberOfGuesses = 0;
            boolean outOfTime = false;
            boolean outOfAttemps = false;
            
            startTime = System.currentTimeMillis();

            do{
                printWord(underScores);
                System.out.print("Enter a letter: ");
                guessLetter = input.nextLine();
                numberOfGuesses++;
                if(!storeUserGuess.contains(guessLetter.charAt(0))){
                    storeUserGuess.add(guessLetter.charAt(0));  
                    
                    for (int i =0; i < secretWord.length(); i++){
                        if(secretWord.charAt(i) == guessLetter.charAt(0)){
                            char[] tempChar = underScores.toCharArray();
                            tempChar[i] = guessLetter.charAt(0);
                            underScores = new String(tempChar);
                        }
                        
                    }
                }
                else{
                    System.out.print(guessLetter.charAt(0) + " is one of previously guessed letters: " + storeUserGuess);
                }

                if(secretWord.equals(underScores)){
                    System.out.printf("Congratulations! You guessed %s in %d tries \n", secretWord, numberOfGuesses);
                    break;
                }

                
                endTime = System.currentTimeMillis();

                if(numberOfGuesses >= maxNumberOfGuesses){
                    outOfAttemps = true;
                    break;
                }
                
                if((endTime - startTime) >= maxTime){
                    outOfTime = true;
                    break;
                }
                
                System.out.println(endTime - startTime);
            } while((endTime - startTime) < maxTime && numberOfGuesses < maxNumberOfGuesses);

            if(outOfAttemps == true){
                System.out.printf("You exceeded %d tries\n", maxNumberOfGuesses);
                System.out.println("The word was " + secretWord);

            }
            
            if(outOfTime == true){
                
                System.out.printf("You exceeded %d seconds to guess the word \n", maxTime);
                System.out.println("The word was " + secretWord);
            }
            


            
            
            


            System.out.print("Do you want to play again? ");
            String yesNo = input.nextLine().toLowerCase();

            while(!yesNo.equals("y") && !yesNo.equals("n")){
                System.out.print("Do you want to play again? ");
                yesNo = input.nextLine().toLowerCase();
            }
             if(yesNo.equals("n")){
                break;
            }
            else if(yesNo.equals("y")){
                continue;
            }


        }
        input.close();
        System.out.println(">");
    }    

    public static String getSecretWord(String[] strArray){
        Random randomWord = new Random();
        int ranIndex = randomWord.nextInt(strArray.length);
        return strArray[ranIndex]; 

    }

    public static void printWord(String sWord){
        for (int i =0; i < sWord.length(); i++){
            System.out.print(sWord.charAt(i) + " ");
        }
        System.out.println();
    }

   
}