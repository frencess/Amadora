import java.util.Scanner;

public class AmadoraLab108b {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a Sentence: ");
        String Sentence = in.nextLine();

          int count = 0;
          for (int i=0; i<Sentence.length();i++)
              switch(Sentence.charAt(i))
              {
                  case 'a':case 'e':case'i':case'o':case'u':                 
                  count++;
                  break;
              }
              {
                  System.out.println(count);
              }
          
          
    }
}