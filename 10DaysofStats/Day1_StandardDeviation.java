/*  Author: MarioCardoso->iamcardozo.eu */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int arr[] = new int[n];
        
        int i = 0;
        
        while(i < n)
        {
            arr[i] = in.nextInt();
            i++;
        }     
        
     
        
        double x= mean(arr);
        double st=stDeviation(arr,x);
        
        System.out.println(st);
        in.close();
    }
    
    public static double mean(int arr[]){
        int pos=0;
        double count=0;
        double mean=0;
        for(int element: arr){
            count+=arr[pos];
           
            pos++;
        }
        mean=count/arr.length;
        return mean;
    }
    
    public static double stDeviation(int arr[], double mean){
        
         double countSt=0;
         int pos=0;
        for(int element: arr){
            
            countSt+=((arr[pos]-mean)*(arr[pos]-mean));
           
            pos++;
        }
        
        double st=countSt/arr.length;
        return Math.sqrt(st);
        
        
    }
    
}
