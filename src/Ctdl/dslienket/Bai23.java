package Ctdl.dslienket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array [] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            linkedList.add(array[i]);
        }
        int k = sc.nextInt();
      if(k <= linkedList.size()){
          linkedList.remove(k);
      }else{
          System.out.println("Sai bét");
      }

        for(int x : linkedList){
            System.out.print(x + " ");
        }

    }
}
