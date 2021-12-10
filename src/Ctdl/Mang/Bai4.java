package Ctdl.Mang;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        // chèn phần tử có giá trị x vào dãy a,
        // ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1.
        // In mảng kết quả ra màn hình

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array [] = new int[n + 1];
        System.out.println("Moi ban nhap số phần tử của mảng");
        for(int i = 0; i < n; i++){
            System.out.println("phần tử thứ : "+(i+1));
            array[i] = sc.nextInt();
        }


        System.out.println("Mời bạn nhập giá trị x: ");
        int x = sc.nextInt();
        System.out.println("mời bạn nhập vị trí trong mảng : ");
        int k = sc.nextInt();
        for(int i = n; i >= k + 1 ; i--){
            array[i] = array[i - 1];
        }
        array[k] = x;
        n++;

        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }

// phân tích
//        + Khi ta nhập k thì khi triển khai vòng lặp,
//        biến k nằm ở vị trí mà ta đã nhập, mảng tăng lên 1
//        những giá trị có vị trí trong mảng sau biến k dời về sau 1.
//        Giống như có 3 người  đang xếp hàng mua coffee mà tự nhiên có 1 đứa chen lên đầu hoặc
//        lên thứ 2 thì mình phải xịch xuống cho nó đứng
//        vòng lặp ( i = n; i >= k + 1; i-- ){...} tức là:
//        + gán i bằng giá trị của mảng
//        + i lớn hơn k+1 tức nếu như n = 3 mà biến k lớn hơn n 1 vòng lặp vẫn có thể handle được,k vẫn nằm trong khoảng i
//                + i-- tức thu hẹp vòng lặp xuống
//        + a[ i ] = a[ i - 1 ] ám chỉ vị trí của biến k ( vì trong mảng số đầu tiên tính là 0 )


// cách giải theo Arraylist
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> listArray = new ArrayList<>();
//
//        for (int i = 0; i < n; i++){
//            int s = sc.nextInt();
//            listArray.add(s);
//        }
//
//
//        int k = sc.nextInt();
//
//        int x = sc.nextInt();
//        listArray.add(k, x);
//        for ( int i = 0; i <= n; i++){
//            System.out.print(listArray.get(i) + " ");
//        }
    }
}
