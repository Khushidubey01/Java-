public class traingle {
    public static void main(String arg[])
    {
        System.out.println("Here your pattern:\n");
        int i,j,row=5,c=0;
        for(i=1;i<=row;i++)
        {
            for(j=row-i;j>=0;j--)
            {System.out.print(" ");}
            for(j=1;j<=2*i-1;j++)
            {System.out.print("*");}
            System.out.print("\n");}
    }
}