import java.util.Scanner;


public class Amadora6 
{
    public static void main(String[] args) 
    {
          Scanner input = new Scanner(System.in);
       
           final double DrivDi, MGallon, PGallon;
       
           System.out.println("Enter the driving distance: ");
           DrivDi= input.nextDouble();
           
           System.out.println("Enter miles per gallon");
           MGallon= input.nextDouble();
           
           System.out.println("Enter price per gallon");
           PGallon= input.nextDouble();
       
           double Totalcost = (DrivDi/MGallon) * PGallon; 
       
        //display
           System.out.printf("The cost of driving is; $%.2f", Totalcost);
    }
    
}
