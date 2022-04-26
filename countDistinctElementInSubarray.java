/*
Searching, Hashing: Find the count of distinct elements in every subarray of size `k`

Input:
arr[] = { 2, 1, 2, 3, 2, 1, 4, 5 };           k = 5;
 
Output:
The count of distinct elements in subarray { 2, 1, 2, 3, 2 } is 3
The count of distinct elements in subarray { 1, 2, 3, 2, 1 } is 3
The count of distinct elements in subarray { 2, 3, 2, 1, 4 } is 4
The count of distinct elements in subarray { 3, 2, 1, 4, 5 } is 5
*/
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        int arr[] = { 1,1,2,2,3,3 };     
        int k = 4;
        int leng = arr.length;
        int n = leng-k+1;
        int j=0;
        Set<Integer> set = new HashSet<>();

        while(n>0){
        for(int i=j; i <k+j; i++){
            set.add(arr[i]);
        }
        int s = set.size();
        System.out.println(s);
        set.clear();
        j++;
        n--;
        }

    }

}
