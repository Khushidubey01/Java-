/*Write a java program to print 1 to 20 number but 10 should not be come:*/
public class Number_ {
    public static void main(String arg[])
    {
        for(int i=1;i<=20;i++)
        {
            if(i==10)
            {continue;}
            System.out.print(i+" ");
        }
    }
}