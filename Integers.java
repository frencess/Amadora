import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        //Calculations  
        if (num1 > num2 && num1> num3)
        {
            System.out.println("Largest is " +num1);
        }
        else if (num2 > num1 && num2> num3)
        {
            System.out.println("Largest is " +num2);
        }
        else if (num3 > num1 && num3> num2)
        {
            System.out.println("Largest is " +num3);
        }
        
    }
    
    
}
