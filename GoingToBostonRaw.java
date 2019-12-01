import java.util.Scanner;

public class GoingToBostonRaw{

    public static void main(String[] args){
        int timAllowance = 1000;
        int comAllowance = 1000;
        int i = 1;
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
            
            //System.out.println( timd1 + " " + timd2 +  " " + timd3);
            //System.out.println( comd1 +  " " + comd2 + " " + comd3);
            System.out.println("[ Round " + i +" ]");
            System.out.println("Tima rolled: ( " + timd1 + " - " + timd2 + " - ? )");
            System.out.println("Comp rolled: ( " + comd1 + " - " + comd2 + " - ? )");
            System.out.println("How much are you betting ??? ");
            int timBet = getBet();
            System.out.println("How much are you betting for computer ??? ");
            int comBet = getBet();
            System.out.println("Your bet: " + timBet + " Computer Bet: " + comBet);

            if (timd1 == timd2 && timd2 == timd3 && comd1 == comd2 && comd2 == comd3){
                System.out.println("Tima rolled: ( " + timd1 + " - " + timd2 + " - " + timd3 + " )");
                System.out.println("Comp rolled: ( " + comd1 + " - " + comd2 + " - " + comd3 + " )");
                System.out.println("You and Computer both got a BigFish and it is Tied!!!");
                break;
            }
            else if(timd1 == timd2 && timd2 == timd3 && (comd1 != comd2 || comd2 != comd3 || comd1 != comd3)){
                timAllowance = timAllowance + timBet * 50;
                comAllowance = comAllowance - timBet * 50;
                System.out.println("Tima rolled: ( " + timd1 + " - " + timd2 + " - " + timd3 + " )");
                System.out.println("Comp rolled: ( " + comd1 + " - " + comd2 + " - " + comd3 + " )");
                System.out.println("BINGO Tim Caught a BigFish!!! Tim Allowance = " +
                                            timAllowance + " Computer Allowance = " + comAllowance);
                break;
            }
            else if((timd1 != timd2 || timd2 != timd3 || timd1 != timd3) && comd1 == comd2 && comd2 == comd3){
                timAllowance = timAllowance - timBet * 50;
                comAllowance = comAllowance + comBet * 50;
                System.out.println("Tima rolled: ( " + timd1 + " - " + timd2 + " - " + timd3 + " )");
                System.out.println("Comp rolled: ( " + comd1 + " - " + comd2 + " - " + comd3 + " )");
                System.out.println("BINGO Computer Caught a BigFish!!! Computer Allowance = " + 
                                            comAllowance + " Tims Allowance = " + timAllowance);
                break;
            }
            int sumTimur = getTimSum(timd1, timd2, timd3, timd4, timd5, timd6);
            int sumComputer = getComSum(comd1, comd2, comd3, comd4, comd5, comd6);
            System.out.println("You had: ( " + timd1 + " - " + timd2 + " - " + timd3 + " ), " + " You rolled: ( " + timd4 + " - " + timd5 + " ), then : ( " + timd6 + " )" + " Your score: " + sumTimur);
            System.out.println("Com had: ( " + comd1 + " - " + comd2 + " - " + comd3 + " ), " + " Com rolled: ( " + comd4 + " - " + comd5 + " ), then : ( " + comd6 + " )" + " Comp score: " + sumComputer);

            if (sumTimur > sumComputer){
                timAllowance = timAllowance + (sumTimur - sumComputer) * timBet;
                comAllowance = comAllowance - (sumTimur - sumComputer) * comBet;     
                System.out.println("You won ): Your Allowance: " + timAllowance + " Computer Allowance: " + comAllowance);
            }
            else if(sumTimur < sumComputer){
                timAllowance = timAllowance - (sumComputer - sumTimur) * timBet;
                comAllowance = comAllowance + (sumComputer - sumTimur) * comBet;
                System.out.println("You Lost ): Your Allowance: " + timAllowance + " Computer Allowance: " + comAllowance);
            }
            else{
                System.out.println("Tied");
            }
        i++;
        }
        if (timAllowance < 0){
            System.out.println("Tim ran out of cash!!!");
        }
        else{
            System.out.println("Computer is broke!!!");
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
    public static int getTimSum(int timad1, int timad2, int timad3, int timad4, int timad5, int timad6){
        int timMax1;
        int timMax2;
        int timurSum;
        
        if (timad3 > timad2 && timad2> timad1 && timad3 > timad1 && timad1 > timad2){
            timMax1 = timad3;
        }
        else if (timad1 > timad2 && timad2 > timad3 && timad1 > timad3 && timad3 > timad2){
            timMax1 = timad1;
        }
        else {
            timMax1 = timad2;
        }
        if (timad4 <= timad5){
            timMax2 = timad5;
        }
        else{
            timMax2 = timad4;
        }

        return timurSum = timMax1 + timMax2 + timad6;
    }
    public static int getComSum(int compd1, int compd2, int compd3, int compd4, int compd5, int compd6){
        int comMax1;
        int comMax2;
        int computerSum;
        if (compd3 > compd2 && compd2 > compd1 && compd3 > compd1 && compd1 > compd2){
            comMax1 = compd3;
        }
        else if (compd1 > compd2 && compd2 > compd3 && compd1 > compd3 && compd1 > compd2){
            comMax1 = compd1;
        }
        else {
            comMax1 = compd2;
        }
        if (compd4 <= compd5){
            comMax2 = compd5;
        }
        else{
            comMax2 = compd4;
        }

        return computerSum = comMax1 + comMax2 + compd6;
    }
}