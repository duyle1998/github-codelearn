package ThuatToan.Bai2;

import java.util.Arrays;

public class Bai3c {
    public  static void main(String[] args){
     int [] arr = {6, 5, 2, 3, 1, 7};


     for(int i = 0; i < arr.length;i++){
         for(int j = i+1; j < arr.length ; j++ ){
             if(arr[i] > arr[j]){

             }


             System.out.println(arr[j]);
         }

     }

//       int sum = 0;
//        int k = 2;
//        while (n % k == 0){
//            sum += k;
//            System.out.println("sum: "+sum);
//            System.out.println(n);
//            n /= k;
//            System.out.println("k: "+k);
//       }
//        k++;
//        System.out.println();
//        System.out.println("sum: "+sum);
//        System.out.println("k: "+k);

    }
}
