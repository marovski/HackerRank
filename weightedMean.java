import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int arr[]= new int[size];
        int weight[]=new int[size];
        
        for(int i=0; i<size;i++){
            arr[i]=in.nextInt();
         
            
        }
           if(in.hasNextInt()){
            for(int j=0;j<size;j++){
                
                weight[j]=in.nextInt();
            }    
            }
        System.out.printf("%.1f",wMean(arr, weight,size));
        in.close();
    }
    public static double wMean(int arr[], int w[], int size){
        int sum=0;
        int div=0;
        for(int i=0;i<size;i++){
           sum+=arr[i]*w[i];
           div+=w[i];
        
        }
        return (double)sum/div;
    }
}
