import java.util.*;

public class a1_q4{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        double low= scn.nextInt();
        double high= scn.nextInt();
        
        for(double i=low; i<=high; i++){
            int count = 0;
            for(int k=2;k<=Math.sqrt(i);k++){
                if (i%k==0){
                    count++;
                }
                
            }
            if (count==0){
                    System.out.println(i);
            }
        }
            
        }
    }
