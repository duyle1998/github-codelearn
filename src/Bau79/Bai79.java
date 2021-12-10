package Bau79;

import java.util.Scanner;

public class Bai79 {
    public static void main(String[] args){
        boolean a;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s);
        int tong = 0;
        for(int i = n; i < n+3;i++){

            tong += i;
            System.out.println(tong);
        }
        if(tong % 3 == 0){

        }
    }
}
