import java.util.*;
   
   public class a1_q8{
   
   public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);
       int n= scn.nextInt();
       int k= scn.nextInt();
       int num= n;
       double num1=n;
       double num2=n;
       int digits=0;
       while(num>0){
           digits++;
           num=num/10;
       }
       k=((k%digits)+digits)%digits;
       int left_shift=n/(int)Math.pow(10,digits-k);
       n=n%(int)Math.pow(10,digits-k);
       n=(n* (int)Math.pow(10,k))+k;
       System.out.println(n);
       
    }
   }
