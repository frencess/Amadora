import java.util.Scanner;

public class PsychTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int Statement1, Statement2, Statement3, Statement4, Statement5, Statement6, Statement7, Statement8;
        
        System.out.println("1. I am competitive:");
         Statement1 = scan.nextInt();
        System.out.println("2. I am annoyed by people who are late for appointments:");
         Statement2 = scan.nextInt();
        System.out.println("3. I perform several tasks simultaneously:");
         Statement3 = scan.nextInt();
        System.out.println("4. I am ambitious:");
         Statement4 = scan.nextInt();
        System.out.println("5. I rush to get tasks completed:");
         Statement5 = scan.nextInt(); 
        System.out.println("6. I worry about the future:");        
         Statement6 = scan.nextInt();
        System.out.println("7. I am in a race with time:");
         Statement7 = scan.nextInt();
        System.out.println("8. I speak very rapidly:");
         Statement8 = scan.nextInt();
        
       
        int Score = (Statement1 + Statement2 + Statement3 + Statement4 + Statement5 + Statement6 + Statement7 + Statement8);
		
                
	if(Score >= 35 && Score <= 40)
        {
	   System.out.println("Score: " + Score + " You are Type A");
	}
	else if(Score >= 21 && Score <= 34)
        {
           System.out.println("Score: " + Score + " You are Between A and B, tending towards A");
	}
	else if(Score >= 12 && Score <= 20)
        {
           System.out.println("Score: " + Score + " You are Between A and B, tending toward B");
	}
	else if(Score >= 8 && Score <= 11)
        {
           System.out.println("Score: " + Score + " You are Type B");
	}
       
    }
    
}
