import java.util.Scanner;
public class mul {
  public static void main(String arg[]) 
    {
        Scanner obj=new Scanner(System.in);
      System.out.println("Enter any number:");
int a= obj.nextInt();
int i=1;
System.out.println("The multiplecation of "+a+" is:");
        do
        {
            System.out.println(a+" * "+i+" = "+a*i);
            i++;
        }            
        while(i<=10);
    }
}