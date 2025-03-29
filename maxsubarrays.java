import java.util.*;

public class maxsubarrays{
    public static void printsubarray( int numbers[]){ 
        Scanner sc = new Scanner(System.in);
        int sum  = 0;
        int tsa = 0; //total subarrays...
        int maxSum = Integer.MIN_VALUE; // Track highest sum
        for( int i = 0 ; i < numbers.length ; i++){
            for ( int j = i ; j < numbers.length ; j++){
                sum  = 0;// reset the sum of subarray...
                for ( int k = i; k <= j ; k++){
                    sum  += numbers[k];
                    System.out.print( numbers[k] + " ");      
                                    
                }
                System.out.println( " Sum =" + sum);
                // Update max and min sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
                tsa++;
            }
            System.out.println();
        }
        System.out.println("The Total subarrays is =" + tsa);
        System.out.println("The max is " + maxSum );
    }

    public static void main(String args[]){
        int numbers[] = { 1, -2, 6, -1, 3};
        printsubarray(numbers);
    }
}