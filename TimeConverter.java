public class TimeConverter
  {
     public static int hoursToMinutes(int hours){
      return hours * 60;
  }
     public static void main(String [] args){
      int timeResult = hoursToMinutes(4);
        System.out.println(timeResult);
  }
}