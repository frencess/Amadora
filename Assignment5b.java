public class Assignment5b 
{

    public static void main(String[] args) 
    {
        System.out.println("Kilograms" + "\t" + "Pounds");
        
        int Limit_kilograms = 198;
        int Kgrams = 0, i = 1;
        
        while (Kgrams <= Limit_kilograms)
        {
            Kgrams = Kgrams + i;
            double pounds = Math.round((Kgrams * 2.2) * 10) /10.0;
            System.out.println(Kgrams + "\t        " + pounds);
        }
        
    }
    
}