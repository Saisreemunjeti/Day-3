public class TemperatureConverter
{
     public static double covertToFahrenheit(double celsius){
      return (celsius * 9/5) + 32;
  }
     public static void main(String [] args){
      double fahrenheitResult = covertToFahrenheit(46.8);
        System.out.println(fahrenheitResult);
  }
}