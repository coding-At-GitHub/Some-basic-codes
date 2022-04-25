import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args){
        int arr[] = {2,2,2,2,1,1,2,2,1};
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){

            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }

        }


        for (Map.Entry<Integer, Integer> set :
             hm.entrySet()) {
 
          
           if(set.getValue() > n/2){
               System.out.println(set.getKey());
               break;
           }
    }


    }
}
