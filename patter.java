
public class patter{
    
    public static void main(String arg[])
    {
        System.out.println("Here your pattern:");
        int i,j,row=5;
        for(i=1;i<=row;i++)
        {
            for(j=row-i;j>0;j--)
            {
              System.out.print(" ");}
            for(j=1;j<=i;j++) 
            {System.out.print("*");}
        System.out.print("\n");}
        }
        
    }
    
