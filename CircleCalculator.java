public class CircleCalculator
  {
     public static double calculateArea(double radius){
      return 3.1416 * radius *radius;
  }
     public static void main(String [] args){
      double areaResult = calculateArea(5.7);
        System.out.println(areaResult);
  }
}