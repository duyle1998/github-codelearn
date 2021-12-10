package Ctdl.dslienket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ "+ (i+1));
            linkedList.add(sc.nextInt());
        }

        for(int i = 0; i < linkedList.size();i++){
            System.out.print(linkedList + " ");
        }
    }
}
