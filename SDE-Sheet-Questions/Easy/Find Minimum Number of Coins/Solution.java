// check from the last of the coins array 
// /check in the array where the amount >= arr[i]

import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount){
        // Write your code here.
        int[] count = new int[1];
        count[0] = 0;
        findCoins(amount,count);
        return count[0];
    }
    public static int findCoins(int amount, int[] count){
        if(amount <= 0){
            return count[0];
        }

        int note = findMAxMinCoin(amount);
        count[0]++;

        return findCoins(amount - note, count);
    }   

    public static int findMAxMinCoin(int amount){
        int[] coins = {1,2,5,10,20,50,100,500,1000};
        int n = coins.length-1;

        for(int i = n;i>=0;i--){
            if(coins[i] <= amount){
                return coins[i];
            }
        }
        return -1;
    }
}

