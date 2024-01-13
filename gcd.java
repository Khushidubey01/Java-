import java.util.Scanner;
public class gcd {
    public static void main (String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a,b,i=1,hcf=1;
        a=obj.nextInt();
        b=obj.nextInt();
        while(i<=a&&i<=b)
        {if(a%i==0&&b%i==0)
        {hcf=i;}
        i++;}
        System.out.print("\n GCD="+hcf);
    }
}