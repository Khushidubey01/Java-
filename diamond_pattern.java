import java.util.Scanner;
public class diamond_pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int row,row1,row2,i,j;
        System.out.println("Enter number of row in odd:");
        row=obj.nextInt();
        row1=row/2;
        row1++;
        row2=row-row1;
        for(i=1;i<=row1;i++)
        {for(j=row1;j>i;j--)
            {System.out.print(" ");}
            for(j=1;j<=2*i-1;j++)
            {System.out.print("*");}
            System.out.print("\n");
        }
        int a=row2;
    for(i=1;i<=row2;i++)
        {for(j=1;j<=i;j++)
            {System.out.print(" ");}
            for(j=2*a-1;j>0;j--)
            {System.out.print("*");}
            a--;
            System.out.print("\n");
        }
    }}