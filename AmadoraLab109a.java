import java.util.Scanner;

public class AmadoraLab109a {

       public static void main(String[] args) {
             Scanner in = new Scanner (System.in);
             System.out.println("Input Telephone Number: ");
             int words = in.nextInt();

             System.out.println("");

             int numbers;
             for(numbers = 0;numbers <= words;){
                 numbers++;

               String letter = in.nextLine();
               letter = letter.toUpperCase();
               int length = letter.length();

               if (length >=7 && length <=8 )
               {
                  for (int a = 0; a < 3; a++) 
                    {
                        switch (letter.charAt(a))
                        {
                            case 'A': 
                            case 'B': 
                            case 'C':
                            System.out.print("2"); break;
                            case 'D': 
                            case 'E': 
                            case 'F':
                            System.out.print("3"); break;
                            case 'G': 
                            case 'H': 
                            case 'I':
                            System.out.print("4"); break;
                            case 'J': 
                            case 'K': 
                            case 'L':
                            System.out.print("5"); break;
                            case 'M': 
                            case 'N': 
                            case 'O':
                            System.out.print("6"); break;
                            case 'P': 
                            case 'Q': 
                            case 'R': 
                            case 'S':
                            System.out.print("7"); break;
                            case 'T': 
                            case 'U': 
                            case 'V':
                            System.out.print("8"); break;
                            case 'W': 
                            case 'X': 
                            case 'Y': 
                            case 'Z':
                            System.out.print("9"); break;
                           }
                    }
                    System.out.print("-");

                    for (int a = 3; a < 7; a++)
                    {
                        switch (letter.charAt(a))
                        {
                            case 'A': 
                            case 'B': 
                            case 'C':
                              System.out.print("2"); break;
                            case 'D': 
                            case 'E': 
                            case 'F':
                              System.out.print("3"); break;
                            case 'G': 
                            case 'H': 
                            case 'I':
                              System.out.print("4"); break;
                            case 'J': 
                            case 'K': 
                            case 'L':
                              System.out.print("5"); break;
                            case 'M': 
                            case 'N': 
                            case 'O':
                              System.out.print("6"); break;
                            case 'P': 
                            case 'Q': 
                            case 'R': 
                            case 'S':
                              System.out.print("7"); break;
                            case 'T': 
                            case 'U': 
                            case 'V':
                              System.out.print("8"); break;
                            case 'W': 
                            case 'X': 
                            case 'Y': 
                            case 'Z':
                              System.out.print("9"); break;
                          }
                       }
                       System.out.println();
               
      }
    }
    }
}