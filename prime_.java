public class prime_ {
        public static void main(String arg[])
    {
        System.out.print("Here your prime number between 1 to 100:\n");
        int a=1;
        while(a<=100)
        {int i=2;
            while(i<a)
        {if(a%i==0)
        {break;}
     i++;}
        if(i==a)
        {System.out.print(a+" ");}
        a++;}
}
}   
