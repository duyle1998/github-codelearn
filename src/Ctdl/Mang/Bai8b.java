package Ctdl.Mang;

import java.util.Scanner;

public class Bai8b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        boolean kq = true;
        if(n > 2){
            for(int i = 2; i < n; i++){
                if((array[i] - array[i - 1]) * (array[i - 1] - array[i - 2]) <= 0){
                kq = false;
                }
            }
            if(kq){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
