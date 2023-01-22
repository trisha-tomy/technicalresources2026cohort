import java.util.*;
    
    public class a1_q9{
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int num1,num2,temp1,temp2,temp;
        num1= scn.nextInt();
        num2= scn.nextInt();
        temp1=num1;
        temp2=num2;


        while(temp2 != 0){
           temp = temp2;
          
           temp2 = temp1%temp2;
    
           temp1 = temp;
   
      }

      int hcf = temp1;
      System.out.println(hcf);
      int lcm = (num1*num2)/hcf;
      System.out.println(lcm);
     }
    }
