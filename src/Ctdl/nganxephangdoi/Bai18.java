package Ctdl.nganxephangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai18 {
    // Số siêu nguyên tố là số:
    //
    //Bản thân nó là số nguyên tố.
    //Khi xóa đi lần lượt các chữ số sau cùng của nó, thì số mới vẫn là số nguyên tố.
    //Ví dụ 2393 là số siêu nguyên tố vì 2393, 239, 23, 2 là số nguyên tố.
    //
    //Cho một số n, hãy đưa số dãy số siêu nguyên tố nhỏ hơn hoặc bằng n, các số đã được sắp xếp tăng dần.
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

    static boolean isSuperPrimer(int n){
        while (n >= 10 && isPrimer(n)){
            n = n/10;
        }
        if(n < 10 && isPrimer(n)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử n");
        int n = sc.nextInt();

        for(int i = 2 ; i <= n ; i++){
            if(isSuperPrimer(i)){
                queue.add(i);
            }

        }
       for(int x : queue){
           System.out.print(x + " ");
       }

    }
}
