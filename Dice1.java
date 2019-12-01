import java.util.Scanner;

public class Dice1{
    
    static int timdice1 = randomGen();
    static int timdice2 = randomGen();
    static int timdice3 = randomGen();
    static int compdice1 = randomGen();
    static int compdice2 = randomGen();
    static int compdice3 = randomGen();
    static int compBalance=1000;
    static int timBalance =1000;
    static int newTimBalance=0;
    static int newCompBalance=0;

    
    public static int randomGen(){
        int randomNumber = (int)(Math.random()*6+1); 
        return randomNumber;
    }
        
    public static void main(String[] args){
        
        int newTimBalance=0;
        int newCompBalance=0;
        System.out.println("Tims Allowance before the bet: >>> " + timBalance);
        System.out.println("Comps Allowance before the bet: >>> " + compBalance); 
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to bet ??? ");
        int bet = input.nextInt();
        
        if(bet>0 && bet<=1500 && newCompBalance>=0 && newTimBalance>=0){
        
            while(true){

                System.out.println("Your bet : >>> " + bet);
                System.out.println("Tims dice1 =>> " + timdice1+ "\n" + "Tims dice2 =>> " + timdice2 +"\n"+ "Tims dice3 =>> " + timdice3 +"\n");
                System.out.println("Comps dice1 =>> " + compdice1 +"\n" + "Comps dice2 =>> " + compdice2 +"\n" + "Comps dice3 =>> " + compdice3);
            
            
                int timDieSum = timdice1+timdice2+timdice3;
                int compDieSum = compdice1+compdice2+compdice3;
                System.out.println("Tims Score: " + timDieSum + " Comps Score: "+compDieSum);

                if(timDieSum > compDieSum){
                    newCompBalance=compBalance-bet;
                    newTimBalance=timBalance+bet;
                    System.out.println("Tim Won!!! New Allowance = >>> "+"Tim = " + newTimBalance +" Comp = "+newCompBalance);
                    break;
                }
                else if(timDieSum < compDieSum){
                    newCompBalance=compBalance+bet;
                    newTimBalance=timBalance-bet;
                    System.out.println("Comp Won!!! New Allowance = >>> "+"Tim = " + newTimBalance +" Comp = "+newCompBalance);
                    break;
                }
                else{
                    
                    System.out.println("Tie!");
                    newCompBalance=compBalance;
                    newTimBalance=timBalance;
                    System.out.println("New Allowance = >>> "+"Tim = " + newTimBalance +"Comp = "+newCompBalance);
                    break; 
                }
            
            }
        } 
        else{
            System.out.println("Your bet is too high or negative....Or you or computer does not have enough money...");
        }
        

    }
        
}

    
