package Ctdl.search;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai32 {
     static int Search(int[] arr,int x){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == x){
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int array[] = new int[n];
       for(int i = 0; i < n; i++){
           array[i] = sc.nextInt();
       }
       int k = sc.nextInt();
        System.out.println(Bai32.Search(array,k));
    }
}
