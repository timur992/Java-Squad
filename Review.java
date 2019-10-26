public class Review {
  public static void main (String[] args) {
    System.out.println("HELLO");
    System.out.println(multiply(1.2, 1.3));
    System.out.println(squareByte((byte)10));

    System.out.println(squareLong(199710820));
    
    System.out.println(squareInt(123));
    
    System.out.println(doubleString("Najib"));

    System.out.println(isNajibHandsome(true));

    System.out.println(squareFloat(1.26f));
    System.out.println(singleChar('A'));
  }

  public static Double multiply(Double a, Double b){
    return a*b;
  }

  public static Byte squareByte(byte b){
    return (byte)(b * b);
  }

  public static Long squareLong(long number){
    return number * number;
  }

  public static int squareInt(int number){
    return number * number;
  }

  public static String doubleString(String str){
    return str + " " + str;
  }

  public static boolean isNajibHandsome(boolean isHandsome){
    return isHandsome || !isHandsome; 
  }

  public static float squareFloat(float number){
    return number * number;
  }

  public static char singleChar(char character){
    return (char)(character + 30);
  }
}

  
