
import java.util.Scanner;

public class Amadora {

    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
       
      final double incomeTax = 0.15, stateTax = 0.035, socialsecTax = 0.0575, 
              MmTax = 0.0275, pensionPlan = 0.05, HealthInsurance = 75.0, npay;
      
       System.out.println("Enter your name: ");
       String name = in.nextLine();
       System.out.println("Gross Amount: ");
       double gAMT = in.nextDouble();   
   
      //Calculate
       double npayVal =  gAMT * incomeTax;
       double stateTaxVal = stateTax * gAMT;
       double socialsecTaxVal = socialsecTax * gAMT;
       double MmTaxVal = MmTax * gAMT;
       double pensionPlanVal = pensionPlan * gAMT;
       npay = gAMT - (npayVal + socialsecTaxVal + stateTaxVal  + MmTaxVal + pensionPlanVal + HealthInsurance);
       
       
       //Display
       System.out.println(name);
       System.out.printf("Gross Amount          : $%.2f", gAMT);
       System.out.printf("\nFederal Tax           : $%.2f", npayVal);
       System.out.printf("\nState Tax             : $%.2f", stateTaxVal);
       System.out.printf("\nSocial Security Tax   : $%.2f", socialsecTaxVal);
       System.out.printf("\nMedicare/Medicaid Tax : $%.2f", MmTaxVal);
       System.out.printf("\nPension Plan          : $%.2f", pensionPlanVal);
       System.out.printf("\nHealth Insurance      : $%.2f", HealthInsurance);
       System.out.printf("\nNet Pay               : $%.2f", npay);
    
    }
}
