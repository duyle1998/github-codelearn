package javacore.Bai54;

import java.util.Scanner;

public class Bai54 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = 0;
        while (a <= b){
//            if(a % 3 == 0 && a % 5 == 0){
//                System.out.print(b + " ");
            System.out.println(a);
           tong = b + a;
            }
        System.out.println(tong);
        }
    }

