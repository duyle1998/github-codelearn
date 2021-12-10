package Ctdl.nganxephangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            if(!queue.contains(a[i])){
                if(queue.size() < k){
                    queue.add(a[i]);
                    continue;
                }
                if(queue.size() == k){
                    queue.poll();
                    queue.add(a[i]);
                }
            }
        }
        while (queue.size() > 0) {
            System.out.print(queue.poll() + " ");
        }
    }
}
