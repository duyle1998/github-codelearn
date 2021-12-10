package Bai77;

import java.util.Scanner;

public class Bai77 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr [] = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        for(int i =0 ; i < arr.length;i++){
            if(arr[i].length() > 3){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
