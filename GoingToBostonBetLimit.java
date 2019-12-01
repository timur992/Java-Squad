import java.util.Scanner;

public class GoingToBostonBetLimit{

    public static void main(String[] args){
        int timAllowance = 1000;
        int comAllowance = 1000;
        int i = 1;
        int maxBet;
        while(timAllowance > 0 && comAllowance > 0){
            int timd1 = getRandom();
            int timd2 = getRandom();
            int timd3 = getRandom();
            int timd4 = getRandom();
            int timd5 = getRandom();
            int timd6 = getRandom();
            int comd1 = getRandom();
            int comd2 = getRandom();
            int comd3 = getRandom();
            int comd4 = getRandom();
            int comd5 = getRandom();
            int comd6 = getRandom();
            
            int sumTimur = getMax3( timd1, timd2, timd3 ) + getMax2( timd4, timd5 ) +timd6;
            int sumComputer = getMax3( comd1, comd2, comd3 ) + getMax2( comd4, comd5 ) +comd6;

            System.out.print("[ Round " + i +" ] ");
            System.out.print("You rolled: ( " + timd1 + " - " + timd2 + " - ? )");
            System.out.println(", machine rolled: ( " + comd1 + " - " + comd2 + " - ? ) ...");
            System.out.print("How much are you going to bet: ");
            int timBet = getBet();

            while((sumTimur - sumComputer) * timBet > timAllowance || (sumTimur - sumComputer) * timBet > comAllowance){
                if((sumTimur - sumComputer) * timBet > timAllowance){
                    maxBet = (int)(timAllowance / (sumTimur - sumComputer));
                    System.out.print("Maximum you could bet this round " + maxBet + " bet again ");
                    timBet = getBet();
                }
                else{
                    maxBet = (int)(comAllowance / (sumTimur - sumComputer));
                    System.out.print("Maximum you could bet this round " + maxBet + " bet again ");
                    timBet = getBet();
                }
            }
            while((sumComputer - sumTimur) * timBet > timAllowance || (sumComputer - sumTimur) * timBet > comAllowance){
                if((sumComputer - sumTimur) * timBet > timAllowance){
                    maxBet = (int)(timAllowance / (sumComputer - sumTimur));
                    System.out.print("Maximum you could bet this round " + maxBet + " bet again ");
                    timBet = getBet();
                }
                else{
                    maxBet = (int)(comAllowance / (sumComputer - sumTimur));
                    System.out.print("Maximum you could bet this round " + maxBet + " bet again ");
                    timBet = getBet();
                }
            }


            if (timd1 == timd2 && timd2 == timd3 && comd1 == comd2 && comd2 == comd3){
                System.out.print("You rolled: ( " + timd1 + " - " + timd2 + " - " + timd3 +" )");
                System.out.println(", machine rolled: ( " + comd1 + " - " + comd2 + " - " + comd3 + " )");
                System.out.println("BigFish...But Tied...");
                break;
            }
            else if(timd1 == timd2 && timd2 == timd3 && (comd1 != comd2 || comd2 != comd3)){
                timAllowance = timAllowance + timBet * 50;
                comAllowance = comAllowance - timBet * 50;
                System.out.println("You had ( " + timd1 + " - " + timd2 + " - " + timd3 + " ) BigFish...");
                System.out.println("Machine had ( " + comd1 + " - " + comd2 + " - " + comd3 + " ), " + " -> Machine rolled: ( " + comd4 + " - " + comd5 + " ) and then rolled ( " + comd6 + " )" + " Machine scored " + sumComputer);
                System.out.println("You won :) You have " +
                                            timAllowance + ", machine has " + comAllowance + "...");
                break;
            }
            else if((timd1 != timd2 || timd2 != timd3) && comd1 == comd2 && comd2 == comd3){
                timAllowance = timAllowance - timBet * 50;
                comAllowance = comAllowance + timBet * 50;
                System.out.println("Machine had ( " + comd1 + " - " + comd2 + " - " + comd3 + " ) BigFish...");
                System.out.println("You had ( " + timd1 + " - " + timd2 + " - " + timd3 + " ), " + " -> You rolled ( " + timd4 + " - " + timd5 + " ) and then rolled ( " + timd6 + " )" + " Your scored " + sumTimur);
                System.out.println("You lost :( You have " +
                                            timAllowance + ", machine has " + comAllowance + "...");
                break;
            }

           
            System.out.println("You had ( " + timd1 + " - " + timd2 + " - " + timd3 + " ), " + " -> You rolled ( " + timd4 + " - " + timd5 + " ) and then rolled ( " + timd6 + " )" + " Your scored " + sumTimur);
            System.out.println("Machine had ( " + comd1 + " - " + comd2 + " - " + comd3 + " ), " + " -> Machine rolled: ( " + comd4 + " - " + comd5 + " ) and then rolled ( " + comd6 + " )" + " Machine scored " + sumComputer);

            if (sumTimur > sumComputer){
                timAllowance = timAllowance + (sumTimur - sumComputer) * timBet;
                comAllowance = comAllowance - (sumTimur - sumComputer) * timBet;     
                System.out.println("You won :) You have " + timAllowance + ", machine has " + comAllowance);
            }
            else if(sumTimur < sumComputer){
                timAllowance = timAllowance - (sumComputer - sumTimur) * timBet;
                comAllowance = comAllowance + (sumComputer - sumTimur) * timBet;
                System.out.println("You Lost :( You have " + timAllowance + ", machine has  " + comAllowance);
            }
            else{
                System.out.println("Tied");
            }
        i++;
        }

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

    public static int getBet(){
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        
        return b;
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

}