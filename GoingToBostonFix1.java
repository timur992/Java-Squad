import java.util.Scanner;

public class GoingToBostonFix1{

    public static void main(String[] args){
        int timAllowance = 1000;
        int comAllowance = 1000;
        int timd1;
        int timd2;
        int timd3;
        int timd4;
        int timd5;
        int timd6;
        int comd1;
        int comd2;
        int comd3;
        int comd4;
        int comd5;
        int comd6;
        int sumTimur;
        int sumComputer;
        int result;
        int factor;
        Scanner input = new Scanner(System.in);
        
        int i = 1;

        while(timAllowance > 0 && comAllowance > 0){
             timd1 = getRandom();
             timd2 = getRandom();
             timd3 = getRandom();
             timd4 = getRandom();
             timd5 = getRandom();
             timd6 = getRandom();
             comd1 = getRandom();
             comd2 = getRandom();
             comd3 = getRandom();
             comd4 = getRandom();
             comd5 = getRandom();
             comd6 = getRandom();
            
            sumTimur = getMax3( timd1, timd2, timd3 ) + getMax2( timd4, timd5 ) +timd6;
            sumComputer = getMax3( comd1, comd2, comd3 ) + getMax2( comd4, comd5 ) +comd6;
            

            System.out.print("[ Round " + i +" ] ");
            System.out.print("You rolled: ( " + timd1 + " - " + timd2 + " - ? )");
            System.out.println(", machine rolled: ( " + comd1 + " - " + comd2 + " - ? ) ...");
            System.out.print("How much are you going to bet: ");
            int timBet = getBet(input);
            result = Math.abs(sumTimur-sumComputer) * timBet;
            factor = 50 * timBet;
            while(timBet < 0 || timBet > 10){

                System.out.print("- your bet must between $1 and $10, type again: ");
                timBet = getBet(input);
            }


            if (getBigFish(timd1, timd2, timd3) && getBigFish(comd1, comd2, comd3)){
                System.out.print("You rolled: ( " + timd1 + " - " + timd2 + " - " + timd3 +" )");
                System.out.println(", machine rolled: ( " + comd1 + " - " + comd2 + " - " + comd3 + " )");
                System.out.println("BigFish...But Tied...");
                break;
            }
            else if(getBigFish(timd1, timd2, timd3)){
                timAllowance = timAllowance + factor;
                comAllowance = comAllowance - factor;
                System.out.printf("You had ( %d , %d , %d ) BigFish!...\n", timd1, timd2, timd3);
                System.out.printf("Machine had ( %d, %d, %d)", comd1, comd2, comd3);
                System.out.printf(" -> Machine rolled ( %d, %d) ", comd4, comd5);  
                System.out.printf(" and then rolled ( %d )",comd6);
                System.out.printf(" Machine scored %d \n", sumComputer);
                System.out.println("You won :) You have " +
                                            timAllowance + ", machine has " + comAllowance + "...");
                break;
            }
            else if(getBigFish(comd1, comd2, comd3)){
                timAllowance = timAllowance - factor;
                comAllowance = comAllowance + factor;
                System.out.printf("Machine had ( %d , %d , %d ) BigFish!...\n", comd1, comd2, timd3);
                System.out.printf("You had ( %d, %d, %d)", timd1, timd2, timd3);
                System.out.printf(" -> You rolled ( %d, %d) ", timd4, timd5  );
                System.out.printf(" and then rolled ( %d )",timd6);
                System.out.printf(" You scored %d \n", sumTimur);
                System.out.println("You lost :( You have " +
                                            timAllowance + ", machine has " + comAllowance + "...");
                break;
            }
            System.out.printf("You had ( %d, %d, %d)", timd1, timd2, timd3);
            System.out.printf(" -> You rolled ( %d, %d) ", timd4, timd5  );
            System.out.printf(" and then rolled ( %d )",timd6);
            System.out.printf(" You scored %d \n",sumTimur);
            System.out.printf("Machine had ( %d, %d, %d)", comd1, comd2, comd3);
            System.out.printf(" -> Machine rolled ( %d, %d) ", comd4, comd5);  
            System.out.printf(" and then rolled ( %d )",comd6);
            System.out.printf(" Machine scored %d \n", sumComputer);
            
            //System.out.println("You had ( " + timd1 + " - " + timd2 + " - " + timd3 + " ), " + " -> You rolled ( " + timd4 + " - " + timd5 + " ) and then rolled ( " + timd6 + " )" + " Your scored " + sumTimur);
            //System.out.println("Machine had ( " + comd1 + " - " + comd2 + " - " + comd3 + " ), " + " -> Machine rolled: ( " + comd4 + " - " + comd5 + " ) and then rolled ( " + comd6 + " )" + " Machine scored " + sumComputer);

            if (sumTimur > sumComputer){
                timAllowance = timAllowance + result;
                comAllowance = comAllowance - result;     
                System.out.println("You won :) You have " + timAllowance + ", machine has " + comAllowance);
            }
            else if(sumTimur < sumComputer){
                timAllowance = timAllowance - result;
                comAllowance = comAllowance + result;
                System.out.println("You Lost :( You have " + timAllowance + ", machine has  " + comAllowance);
            }
            else{
                System.out.println("Tied");
            }
        i++;
        }
        input.close();
        if (timAllowance < 0){
            System.out.println("Tim ran out of cash!!!");
        }
        else if (comAllowance < 0) {
            System.out.println("Computer is broke!!!");
        }
        else{
            System.out.println(" Dont play in Casinos!");
        }

    }
    public static int getRandom() {
        return (int)(Math.random() * 6 + 1);
    }

    public static int getBet(Scanner input){
        int userBet = input.nextInt();
        return userBet;
    }
    
    public static int getMax3(int a, int b, int c){
        int max3 = 0;

        if (a >= b && a >= c){
            max3 = a;
        }
        else if (b >= a && b >= c ){
            max3 = b;
        }
        else if(c >= a && c >= b){
            max3 = c;
        }
        return max3;

    }
    public static int getMax2(int m1, int m2){
        int max2 =0;

        if (m1 <= m2){
            max2 =m2;
        }
        else{
            max2 = m1;
        }
        return max2;
    }
    public static boolean getBigFish(int die1, int die2, int die3){
        return die1 == die2 && die2 == die3;
    }
}