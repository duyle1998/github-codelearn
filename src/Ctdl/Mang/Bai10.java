package Ctdl.Mang;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[][] = new int[n][m];
        int tong = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
                tong += array[i][j];
            }
        }

        System.out.print(tong);

    }
}
