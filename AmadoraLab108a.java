import java.util.Scanner;

public class AmadoraLab108a {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Input an integer ");
        int Num = scan.nextInt();
        int Sum = 0;
        
        if (Num <0)
            Num = -Num;
            
        while (Num > 0)
          {
            Sum = Sum + Num % 10;
            Num = Num / 10;            
          }
            System.out.println("The sum is "+Sum);
        
        
        
      }
    
}