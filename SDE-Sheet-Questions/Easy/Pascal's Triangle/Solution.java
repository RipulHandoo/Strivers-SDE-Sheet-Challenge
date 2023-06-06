import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> list = new ArrayList<>();
				for(int row = 0;row<n;row++){
					ArrayList<Long> list1 = new ArrayList<>();
					long ans = 1;
					list1.add(ans);
					for(int j = 0;j<row;j++){
						ans = ans*(row-j);
						ans = ans/(j+1);
						list1.add(ans);
					}
					list.add(list1);
				}

				return list;
	}
}
