package abcd;

public class aaa {
    
    public static void main(String[] args) {
        System.out.println("Here your pattern:\n");
        int i;
        for(i=1;i<=5;i++)
        {switch(i)
            {
     case 1 :{for(int j=1;j<=10;j++)
         {if(j==1||j==10)
         {System.out.print("*");}
             else{System.out.print(" ");}
         }break;
     }
   case 2 :{System.out.print("\n");
       for(int j=1;j<=10;j++)
         {if(j==1||j==2||j==9||j==10)
         {System.out.print("*");}
             else{System.out.print(" ");}
         }
     break;}
   case 3 :{System.out.print("\n");
       for(int j=1;j<=10;j++)
         {if(j==1||j==2||j==3||j==8||j==9||j==10)
         {System.out.print("*");}
             else{System.out.print(" ");}
         }
     break;}
                case 4:{System.out.print("\n");
       for(int j=1;j<=10;j++)
         {if(j==5||j==6)
         {System.out.print(" ");}
             else{System.out.print("*");}
         }
     break;}
      case 5:{System.out.print("\n");
          for(int j=1;j<=10;j++)
          {
              System.out.print("*");
          }
        break; }       
            }
        }
    }
    
}
    
