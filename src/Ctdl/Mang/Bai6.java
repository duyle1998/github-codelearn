package Ctdl.Mang;

import java.util.Scanner;

public class Bai6 {
    static boolean isPrimer(int n){
        if(n <= 1){
            return false;
        }for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n;i++){
            if(isPrimer(array[i])){
            System.out.print(array[i]+ " ");
        }
        }
        }


}
