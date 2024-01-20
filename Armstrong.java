import java.util.Scanner;
public class Armstrong {
    
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter any number:");
        int num,rem,n,digit=0,sum=0;
        num=obj.nextInt();
        n=num;
        while(num!=0)
        {num=num/10;
            digit++;}
        num=n;
        while(num!=0)
        {rem=num%10;
            sum+=Math.pow(rem,digit);
            num=num/10;}
        if(n==sum)
        {
            System.out.print("Armstrong number:");
        }
        else
        {System.out.print("Not armstrong number:");}
    }
    
}