import java.util.Scanner;


public class Amadora5 
{
    public static void main(String[] args) 
    {
          Scanner input = new Scanner(System.in);
       
           int time;
           int MinTime, HourTime, TimeSec;
        
           System.out.print("Enter time in seconds: ");
           time = input.nextInt();
       
           HourTime = (int) time / 3600;
           MinTime = (time%3600) / 60;
           int secs = time%60;
       
         //Display
           System.out.println("Time is " + HourTime + " hour " + MinTime + " minutes " + secs + " seconds");
    }
    
}
