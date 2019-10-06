import java.util.Scanner;

public class Assignment5a 
{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        
        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;
        
        System.out.println("Enter an integer, the input end if it is 0: ");
        int Int = scan.nextInt();
        
        if (Int == 0)
           {
               System.out.println("No numbers are entered except 0");
               System.exit(1);
           }
        while (Int !=0)
           {
               if (Int>0)
                   positives++;
               else negatives++;
               
               total += Int;
               count++;
               
           }
            
        double average = total / count;
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
               

    }
    
}