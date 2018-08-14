import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] anArray = new int[t];

       
              
                
        for(int i=0;i<t;i++){
            anArray[i]=in.nextInt();                  
              }
       

        System.out.println( df.format( mean(anArray, t)));
        System.out.println( df.format(median(anArray)));
        System.out.println(mode(anArray));
        
        in.close();
        
    }
    
    public static double mean(int[] arr, int t){
        int j=0;
        
        for(int i=0;i<t;i++){
            
            j+=arr[i];
        }
        return (double)j/t;
    }
      public static double median(int[] numArray){
       Arrays.sort(numArray);
        double median;
        if (numArray.length % 2 == 0)
       median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
         median = (double) numArray[numArray.length/2];
          
          return median;
    }
    
    
  public static int mode(int []arr) 
    {
        int maxValue = 0, maxCount = 0;
 
        for (int i = 0; i < arr.length; ++i) 
        {
            int count = 0;
            for (int j = 0; j < arr.length; ++j) 
            {
                if (arr[j] == arr[i])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = arr[i];
            }
        }
 
        return maxValue;
    }
}
