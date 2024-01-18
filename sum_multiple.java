/*Write a java program to calculate sum of the numbers occuring in the multiplication of given number:*/
import java.util.Scanner;
public class sum_multiple {
public static void main (String arg[]){
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter any number:");
    int num=obj.nextInt();
    int i=1,sum=0;
    do{
        System.out.println(i+"×"+num+"="+i*num);
        sum=sum+i*num;
        i++;
    }
    while(i<=10);
    System.out.print("\nSum="+sum);
}   
}