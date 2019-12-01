public class Dice2{

    static int humand1, humand2, humand3 = getDiceValue();
    static int compd1, compd2, compd3 = getDiceValue();
    public static void main(String[] args){
       System.out.println(humand1 + humand2 + humand3);
       System.out.println(compd1 + compd2 + compd3); 
    }

    public static  int  getDiceValue(){     
       int randomNumber = (int)(Math.random()*6+1);
       return randomNumber;
    }
    public static void bigFish(){

    }
}