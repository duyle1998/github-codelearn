package ThuatToan.Bai2;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f, f1 = 1, f2 = 1;
        if(n <= 2){
            System.out.println("Mời bạn nhập lại");
        }else{
            System.out.println("f1: "+f1);
            System.out.println("f2: "+f2);
            for(int i = 3; i < n; i++){
                f = f1 + f2;
                f1 = f2;
                f2 = f;
                System.out.println(f);
            }

        }
    }
}
