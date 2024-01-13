package abc;
import java.util.Scanner;

public class aa {
    
    
   public static void main(String arg[]) 
    {
        Scanner obj=new Scanner(System.in);
    System.out.print("Enter first number:") ;
int a=obj.nextInt();
System.out.print("\n Enter last number:\n");
int b=obj.nextInt(); 
System.out.print("\n Here your table\n");
        for(;a<=b;a++)       
        {
            for(int i=1;i<=10;i++)
            { System.out.print(a*i+" ");}
            System.out.print("\n");}
        }        
    }
