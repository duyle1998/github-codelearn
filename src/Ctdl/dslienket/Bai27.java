package Ctdl.dslienket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (list.size() < 1) {
                list.add(i);
            }
            else {
                list.add(i);
                list.addFirst(i);
            }
        }

        for (Integer value : list)
            System.out.print(value + " ");



    }
}
