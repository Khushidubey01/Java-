import java.util.Scanner;
public class sumofeven {
    public static void main(String arg[])
    {
     Scanner obj= new Scanner(System.in);
   System.out.print("Enter any number:");
int a=obj.nextInt();
int sum=0,count=0,i=2;
        do{
            if(i%2==0)
            {System.out.print(i+" ");
                sum=sum+i;
                count++;
            }
       i++; }  
        while(count!=a);
System.out.print("sum="+sum);        
    }
}