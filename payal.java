package kd;
import java.util.Scanner;
public class payal{
    public static void main(String arg[])
    {
    Scanner obj=new Scanner(System.in);
System.out.print("Enter any number:") ;
int num=obj.nextInt();  
        if(num>0) 
        {System.out.print("Positive number:");} 
        else{if(num==0)
        {
            System.out.print("zero");
        }
            else{System.out.print("Negative");}  
        }        
    }
}