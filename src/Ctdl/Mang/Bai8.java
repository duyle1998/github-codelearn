package Ctdl.Mang;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args){
        // Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số a.
        // Hãy kiểm tra xem dãy a có phải là dãy đơn điệu hay không, trả về "YES" nếu có, "NO" nếu không.
        //
        //Một dãy đơn điệu khi nó là dãy số tăng (a[i] > a[i-1]), hoặc dãy số giảm (a[i] < a[i-1])
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        boolean kt1 = true;
        boolean kt2 = true;
        for(int i = 1; i < n; i++){
            if(array[i] <= array[i -1]){
                kt1 = false;
            }
            if(array[i] >= array[i -1]){
                kt2 = false;
            }

        }
        if(kt1 || kt2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
