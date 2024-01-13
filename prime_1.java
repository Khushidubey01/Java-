
public class prime_1 {
    
    public static void main(String arg[])
    {
        System.out.println("Here all prime numbers between 1 to 100:");
        int a,i;
        for(a=1;a<=100;a++)
        {
            for(i=2;i<a;i++)   
            {
                if(a%i==0)
                {break;}
            }            
            if(i==a)     
            {System.out.print(a+" ");}      
        }
    }
    
}
