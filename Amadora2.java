import java.util.Scanner;

public class Amadora2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int pizzas, toppings;
       
        System.out.println("Enter the number of pizzas:");
        pizzas = input.nextInt();
        System.out.println("Enter the total number of toppings:");
        toppings = input.nextInt();
        
        final double tax = 0.05;
          
        //calculate 
        int regularprice = pizzas * 12;
        double additionaltopping = toppings * 1.50;
     
        double without = regularprice + additionaltopping;
        double with = without * tax; 
        double total = without + with;
        
        //display
        System.out.println("Receipt:Number of Pizzas" + pizzas);
        System.out.println("Number of Toppings" + toppings);
        System.out.println("Cost (incl tax)" + total);
        
    }
    
}
