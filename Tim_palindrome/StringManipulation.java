public class StringManipulation{

    public static void main(String[] args){
        String a = "diana";
        String b = "timur";
        String c = "Diana is Tims only daughter";
        
        for (String word:c.split(" ")){
            System.out.println(word.toUpperCase().charAt(0));
        }


        
        
        
        
        //System.out.println(a.toUpperCase());
        //System.out.println(a.length());
        //System.out.println(b.length());

        /* for (int i=a.length()-1; i >=2;i--){
            System.out.println(a.charAt(i));
        }

        if(a.length()==b.length()){
            System.out.println("the length of string a and b are equal!");
        }
        else{
            System.out.println("a length is not equal to b length");
        }

        for (int k=0; k < a.length();k++){
            System.out.println(b.charAt(k) + " * ");
            for(int j =0; j < a.length(); j++){
                System.out.println(a.charAt(j));
            }
        } */


    }
}