public class ShapeCalculator
  {
     public static double calculatePerimeter(double length, double width){
      return 2 * (length + width);
  }
     public static void main(String [] args){
      double shapeResult = calculatePerimeter(7.0 , 9);
        System.out.println(shapeResult);
  }
}