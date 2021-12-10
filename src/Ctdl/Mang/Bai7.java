package Ctdl.Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static  void main(String[] args){
        //Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số,
        // hãy đếm tần số (số lần xuất hiện) của các số trong dãy và in nó ra màn hình dưới dạng sau
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
      //  int arrayb[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("mời bạn nhập phần tử thứ "+(i+1));
            array[i] = sc.nextInt();
        }
//        Arrays.sort(array);
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int count = 0;
        int arrayb = array[0];
        for(int i = 0; i < n; i++){
            if(array[i] == arrayb){
                count++;
                System.out.println("\naaaaaa");
            }else{
                System.out.print("else: "+array[i - 1] + " - " + count +";");
                count=1;
                arrayb = array[i];
            }
        }
        System.out.print("in: "+array[n-1]+" - "+count+";");


        // hướng dẫn làm
//        int Max = arraya[0];
//        for(int i = 0; i <= Max ;i++){
//            arrayb[i] = 0;
//        }
//        for(int i = 0; i < n; i++){
//            arrayb[arraya[i]] += 1;
//        }
//        for(int i = 0; i <= Max;i++){
//            if(arrayb[i] >0){
//                System.out.println(i + "-" + arrayb[i] + "; ");
//            }
//        }




    }
}
