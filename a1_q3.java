import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
      int t= scn.nextInt();
      for (int i=0; i<t;i++){
         double n = scn.nextInt(); 
         int count=0;
         for (int k=2; k<=Math.sqrt(n);k++){
             if (n%k==0){
                 count++;
             }
             else{
                 continue;
             }
         }
         if (count==0){
             System.out.println("prime");
         }
         else{
             System.out.println("not prime");
         }
      
  
      }
      
   }
  }
