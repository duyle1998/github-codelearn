package Ctdl.nganxephangdoi;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai17 {
    //Nhập vào một số nguyên dương n, tiếp theo nhập n số nguyên lần lượt là các phần tử của queue.
    // Cuối cùng nhập vào một số tự nhiên k.
    //
    //Một phép biến đổi sẽ dịch chuyển phần tử đầu tiên ra sau phần tử cuối cùng của dãy,
    // hãy trả về dãy sau khi đã biến đổi k lần. In tất cả các phần tử ra màn hình,
    // sau mỗi phần tử có đúng một khoảng trắng.

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.println("nhập array thứ "+(i+1));
            array[i] = sc.nextInt();
            queue.add(array[i]);
        }
        System.out.println("Nhập K");
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            // offter chèn phần tử chỉ định vào hàng đợi
            // poll trả về và loại bỏ phần đầu của hàng đợi
         queue.offer(queue.poll());


        }
      // System.out.print(queue.poll());
        for(int x : queue){
            System.out.print(x + " ");
        }

    }
}
