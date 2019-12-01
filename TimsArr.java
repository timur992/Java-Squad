public class TimsArr{

    public static void main(String[] args){

        int[] nums={0,100,200,300};

        String[] names = {"tim","baxa","shams","naja","diana"};

        for (int num:nums){

            System.out.println(num);
        }
        int i=0;

        while(i<names.length){
            System.out.println(names[i]);
            for (int j=names[i].length()-1; j>=0; j--){
                System.out.println(names[i].charAt(j));
            }
            i++;
        }

    }
}