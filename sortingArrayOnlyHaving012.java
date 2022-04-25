import java.io.*;
import java.util.*;

class Main{
     public static void main(String[] args){
         int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
         int a=0,b=0,c=0;
          for(int i=0; i<arr.length; i++){
             switch (arr[i]) {
            case 0:
                a++;
                break;
            case 1:
                b++;
                break;
            case 2:
                c++;
                break;
            }
            
            
            
         /*     if(arr[i]==0){
                  a++;
              }else if(arr[i]==1){
                  b++;
              }else{
                  c++;
              }
          */  
          }
  int i =0;
         while(a>0){
             arr[i]=0;
             a--;
             i++;
         }
    while(b>0){
             arr[i]=1;
             b--;
             i++;
         }
         while(c>0){
             arr[i]=2;
             c--;
             i++;
         }
   

    for(int j=0; j<arr.length; j++){
        System.out.print(arr[j]+" ");
    }

 }

}
