package Ctdl.dslienket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("phần tử thứ "+(i+1));
            linkedList.add(sc.nextInt());
        }

      //  System.out.println(linkedList);
        System.out.println("nhập k");
         int k = sc.nextInt();
        // gán x =  lấy vị trí của k trong list
        int x = linkedList.get(k);
        // duyệt vòng for nếu các phần tử nào trong list > x thì remove
        for(int i = 0; i < linkedList.size();i++){
            if(linkedList.get(i) > x){
                linkedList.remove(i);
                    i--;

            }
//
        }

        for(int c : linkedList){
            System.out.print(c + " ");
        }

    }
}
