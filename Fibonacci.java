import java.util.Scanner;
public class Fibonacci {
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any number:");
        int num=obj.nextInt();
        int i,n1,n2=1,n3=0;
        for(i=1;i<=num;i++)
        {
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            n3=n1+n2;}
        }
    }
