import java.util.Scanner;
public class even_or_odd {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
    System.out.print("Enter any number:");
int num=obj.nextInt();
        if(num%2==0) 
        {System.out.print("Even number");}  
        else
        { System.out.print("odd number");}            
    }
    
    
}