
public class down_trangle{
    
    public static void main(String[] args) {
        System.out.println("Here your pattern:");
       int i,j,row=5,a=row;
        for(i=1;i<=row;i++)
        {for(j=1;j<i;j++)
            {System.out.print(" ");}
            for(j=2*a-1;j>0;j--)
            {System.out.print("*");}
            a--;
            System.out.print("\n");
        }
    }}
 