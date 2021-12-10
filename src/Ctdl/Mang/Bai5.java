package Ctdl.Mang;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
    // xóa phần tử có chỉ số k ở trong dãy đó. In mảng kết quả ra màn hình
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n + 1];
        System.out.println("Moi ban nhap số phần tử của mảng");
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ : " + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println("Nhập vị trí phần tử k ");
        int k = sc.nextInt();
        for(int i = k; i < n; i++){
            array[i] = array[i + 1];
        }
        n--;
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
