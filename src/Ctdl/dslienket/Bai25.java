package Ctdl.dslienket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai25 {
    // Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số,
    // hãy cài đặt nó vào một danh sách liên kết đơn. Tiếp theo nhập hai số nguyên a và b.
    //Hãy thay đổi giá trị của những phần tử có giá trị a thành giá trị b.
    // In ra màn hình danh sách đó, sau một phần tử có đúng một khoảng trắng.


    public static  void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
          linkedList.add(sc.nextInt());
        }
        System.out.println("Nhập b");
        int b = sc.nextInt();
        System.out.println("Nhập k");
        int k = sc.nextInt();


        for(int i = 0; i < linkedList.size(); i++){
            //phuong thuc contains xem có chứa không?
            if(linkedList.contains(k)){
                // indexOf để lấy các vị trí chứa k == với phần tử trong list.
                int index = linkedList.indexOf(k);
                // lấy các vị trí và gán phần tử vào
                linkedList.set(index,b);
            }
        }
        System.out.println(linkedList);
        for(int x : linkedList){
            System.out.print(x + " ");
        }


    }
}
