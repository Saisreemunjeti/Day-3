public class BillCalculator
  {
     public static double calculateTotalWithTax(double amount, double taxPercent){
      return amount + (amount * taxPercent / 100);
  }
     public static void main(String [] args){
      double billResult = calculateTotalWithTax(67.0, 58.9);
        System.out.println(billResult);
  }
}