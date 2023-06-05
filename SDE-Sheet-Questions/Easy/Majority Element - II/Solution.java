import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > arr.size()/3){
                result.add(e.getKey());
            }
        }

        return result;
    }
}
