
public class pt {
    public static void main(String[] args) {
        System.out.println("Here your pattern:\n");
       int a=1;
        
        do{
            int b=5;
            do{
                System.out.print("*");
                b--;
            }
            while(b>=a);
            System.out.print("\n");
            a++;}      
        while(a<=5);
    }      
    
}