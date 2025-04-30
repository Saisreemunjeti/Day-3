public class StringUtility
  {
     public static int getLength(String input){
      return input.length();
  }
     public static void main(String [] args){
      int lengthResult = getLength("Hai");
        System.out.println(lengthResult);
  }
}