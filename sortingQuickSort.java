import java.io.*;
import java.util.*;

class Main{
    public static void main (String[] args){
        int arr[] = {8,5,6,44,552,3,45,67};
        int n  = arr.length;

        quickSor(arr,0,n-1);

        for(int i= 0; i<n; i++){
                System.out.print(arr[i]+" ");
        }
       
    }
   
    static void quickSor(int arr[], int low, int high){
        if(low < high){
           int pivot = divide(arr, low, high);
       
        quickSor(arr, low, pivot - 1);
        quickSor(arr, pivot + 1, high);
        }

    }
    static int divide(int arr[], int low, int high){
        int pivot = arr[high];
        int j= low - 1;
       
        for(int i = low; i<= high-1 ; i++){
            if(arr[i] < pivot){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr,high,j+1);
        return (j+1);

    }
    static void swap(int arr[], int m, int n){
        int temp = arr[m];
        arr[m]= arr[n];
        arr[n]= temp;
    }

}
