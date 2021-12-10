package Ctdl.Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
// Cho dãy a gồm n số nguyên, và dãy b gồm m số nguyên, cả hai dãy đều được sắp xếp không giảm.
//Hãy gộp hai dãy thành một dãy c, sao cho dãy c cũng là dãy không giảm.
// In dãy c ra màn hình, sau mỗi phần tử có đúng một dấy cách.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Mời bạn nhập mảng a");
        for(int i = 0; i < n; i++){
            System.out.println("Nhập giá trị mảng a thứ: "+(i+1));
            a[i] = sc.nextInt();
        }
        System.out.println("Mời bạn nhập mảng b");
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i = 0; i < m; i++){
            System.out.println("Nhập giá trị mảng b thứ: "+(i + 1));
            b[i] = sc.nextInt();
        }
        // tạo mảng c
        int size = 0;
        int c[] = new int[n + m];
        // add mảng a vào c
        for(int i = 0; i < n; i++){
            c[size] = a[i];
            size++;
        }
        // add mảng b vào c
        for(int i = 0; i < m; i++){
            c[size] = b[i];
            size++;
        }
       // sắp xếp c
//        Arrays.sort(c);
    for(int i = 0; i < n + m; i++){
        for(int j = i+1; j < n + m; j++){
            if(c[i] > c[j]){
                int temp;
                temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
    }

    for(int i = 0; i < n + m ; i++){
        System.out.print(c[i] + " ");
    }
//       for(int x: c){
//           System.out.print(x + " ");
//       }

    }

}
