public class Comparisons {
  public static void main(String[] args){
    byte byteNumber = 1;
    short shortNumber = 10;
    int intNumber = 100;
    long longNumber = 1000;
    float floatNumber = 1.1f;
    double doubleNumber = 1.11;
    boolean booleanNumber = true;

    String name1 = new String("najib");
    String name2 = new String("najib");

    // System.out.println(byteNumber == 1);
    // System.out.println(shortNumber == 10);
    // System.out.println(intNumber == 100);
    // System.out.println(longNumber == 1000);
    // System.out.println(floatNumber == 1.1f);
    // System.out.println(doubleNumber == 1.11);
    // System.out.println(booleanNumber == true);
    
    System.out.println(name1);
    System.out.println(name2);
    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));
  }
}