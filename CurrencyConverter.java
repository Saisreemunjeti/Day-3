public class CurrencyConverter
  {
     public static double rupeesToUSD(double rupees){
      return rupees / 83.0;
  }
     public static void main(String [] args){
      double currencyResult = rupeesToUSD(67.0);
        System.out.println(currencyResult);
  }
}