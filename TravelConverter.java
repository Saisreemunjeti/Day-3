public class TravelConverter
  {
     public static double kmToMiles(double km){
      return km * 0.621371;
  }
     public static void main(String [] args){
      double kmResult = kmToMiles(54.8);
        System.out.println(kmResult);
  }
}