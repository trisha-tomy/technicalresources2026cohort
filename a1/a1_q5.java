import java.util.*;
  
  public class a1_q5{
  
  public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
      int n= scn.nextInt();
      int count=0;
      int num=n;
      while (num>0){
          int rem= num%10;
          if (rem>=0){
              count++;
              num=num/10;
          }
          else{
              continue;
          }
      }
      System.out.println(count);
   }
  }
