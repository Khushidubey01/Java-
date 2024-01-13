package kk;
import java.util.Scanner;
public class priya {
 public static void main (String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=obj.nextInt();
        switch (n)
        {
            case 0:{System.out.print("Sunday");break;}
            case 1:{System.out.print("Monday");break;}
            case 2:{System.out.print("Tuesday");break;}
            case 3:{System.out.print("Wednesday");break;}
            case 4:{System.out.print("Thursday");break;}
            case 5:{System.out.print("Friday");break;}
            case 6:{System.out.print("Saturday");break;}
        }
        
    }    
    
    
}