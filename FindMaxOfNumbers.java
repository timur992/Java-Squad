import java.util.Scanner;

public class FindMaxOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max3Numbers = getMax3(a , b , c);
        int max2Numbers = getMax2(a , b);

        System.out.println("Maximum of 3: " + a + " " + " " + b + "  " + c + " is " + max3Numbers);
        System.out.println("Maximum of 2: " + a + " " + " " + b  + " is " + max2Numbers);
        input.close();
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