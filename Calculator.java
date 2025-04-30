public class Calculator{
     public static int add(int a, int b){
      return a + b;
  }
     public static int subtract(int a, int b){
      return a - b;
  }
     public static void main(String [] args){
      int addResult = add(30 , 40);
         System.out.println(addResult);
      int subtractResult = subtract(45 , 30);
         System.out.println(subtractResult);
  }
}