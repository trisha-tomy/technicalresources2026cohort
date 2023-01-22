import java.util.*;
   
   public class a1_q6{
   
   public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);
       int n= scn.nextInt();
       int num=n;
       int rev_num=0;
       while (num>0){
           int rem= num%10;
           if (rem>=0){
               rev_num=rev_num*10+rem;
               num=num/10;
           }
           System.out.println(rem);
       }
       
    }
   }
