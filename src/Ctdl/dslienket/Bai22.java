package Ctdl.dslienket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ "+ (i+1));
            linkedList.add(sc.nextInt());
        }
        System.out.println("aaaaaaaa: " +linkedList );
        System.out.println("Nhập giá tri x");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí của k trong Linkedlist");
        int k = sc.nextInt();
        if(k <= linkedList.size()){
            linkedList.add(k,x);
        }else{
            System.out.println("k nằm ngoài phạm vi");
        }


//        for(int i = 0; i < linkedList.size();i++){
//            System.out.print(linkedList.get(i)+ " ");
//        }
        for(int c : linkedList){
            System.out.print(c + " ");
        }
    }
}
