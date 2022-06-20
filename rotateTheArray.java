//Rotate the array, left or right based on positive or negative

import java.io.*;
import java.util.*;
//time complexity = O(n)
//Space complexity = O(n)
class Main{
     public static void main(String[] args){
         int a[] = {1,2,3,4,5};
         int n = a.length;
         int k = 2;
          k=k % n;
         int b[] = new int[n];

         for(int i=0;i<n;i++){
             b[(i+k)%n] = a[i];
         }
     
        for(int i = 0; i<n; i++){
            System.out.print(b[i]+ " ");
        }

    }
}
