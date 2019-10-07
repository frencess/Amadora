import java.util.Random;
import java.util.Scanner;


public class Practice {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner (System.in);
        String word = in.next();
        
        
        //ProbleCHECKINGPALINDROMEchapter5
        int first=0,last=word.length()-1, length = word.length();
           boolean isPalindrome = true;
           while(length != 0){
           if(word.charAt(first)== word.charAt(last)){
               isPalindrome = true;
           }
           else{
               isPalindrome = false;
               break;
           }   
           first++;
           last--;
           length /=2;
               System.out.println(first);
               System.out.println(last);
           
           }
           System.out.println(isPalindrome);
       }
    }
          
                
                
        //exampleofBREAKandCONTINUE
//        int sum= 0,num;
//        do{
//            num=in.nextInt();
//            if (num==10)break;//or continue
//            else sum+=num;
//        }while (num!=0);
//        System.out.println(sum);
//        }



          //NESTEDexampleforaMultiplicationTable
//        for(int i=1; i<=10;i++)
//        {
//            for (int j=1;j<=10;j++)
//            {
//                System.out.println(j*i +"\t");
//            }
//            System.out.println("");            
//        }
//        
        
//        //forexample
//        int score=0;
//        
//        for(int i=0; i<5;i++){
//            
//        }

        
//        //dowhileexample
//        int sum = 0,num;
//        do{
//            num=scan.nextInt();
//            sum +=num;
//        }while (num!=0);
        
        
        
//        int sum =0;
//        int num =scan.nextInt();
//        while(num)
        
//        //Problem 3 in chapter 5
//        int numberOfQuestions =0, score=0; 
//        
//        while (numberOfQuestions <5) {
//        int num1 =rand.nextInt(10);
//        int num2 =rand.nextInt(10);
//        System.out.println(num1+"-"+num2+"=");
//        int answer = scan.nextInt();
//        numberOfQuestions++;
//        if (answer == num1 - num2)score++;        
//        }
        
        
         
//        int randomNumber =0;
//        int guess = -1;
//        
//        while(guess!-randomNumber){
//          randomNumber =rand.nextInt(101);
//          guess = scan.nextInt();
//          
//          if (guess>)




//        //Problem 1 in chapter 5
//       
//        int answer = 0;
//        int correctAnswer = 1;
//
//        System.out.println(num1 + "+" + num2 + "=");        
//        int answer = scan.nextInt();
//        int correctAnswer = num1+num2;
//        
//        while (answer!=correctAnswer)
//        {
//            int num1 = rand.nextInt(10);
//            int num2 = rand.nextInt(10);
//            System.out.println("Answer in wrong try again");
//        }
//        
//        System.out.println("Your answer is correct");
//        
        
        
//        //example in chapter 5
//        int count = 0;
//        while (count <5) {
//            System.out.println("Welcome to Java");
//            count++;
//            
       
    
    
