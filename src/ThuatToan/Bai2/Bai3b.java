package ThuatToan.Bai2;

import java.util.Scanner;

public class Bai3b {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();
        int ucl = 1,bcnn;
        for(int  i = 1; i <= a && i <= b;i++){
            if(a % i == 0 && b % i == 0){
                ucl = i;
            }

        }
        System.out.println("UCL của a: "+a +", b: "+b +", Là: "+ucl);
        System.out.println();
        bcnn = (a * b) / ucl;
        System.out.println("BCNN của a: "+a +", b: "+b +", Là: "+bcnn);
    }
}
