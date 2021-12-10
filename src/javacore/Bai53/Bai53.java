package javacore.Bai53;

import java.util.Scanner;

public class Bai53 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập phần tử n");
        int n = sc.nextInt();
        System.out.println("mời bạn nhập phần tử m");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
           for(int j = 0; j < m;j++){
               arr[i][j] = sc.nextInt();
           }
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m;j++){
                if(arr[i][j] % 5 == 0){
                    tong += arr[i][j];
                }
            }
        }

        System.out.println(tong);


    }
}
