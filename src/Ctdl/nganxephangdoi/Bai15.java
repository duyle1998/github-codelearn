package Ctdl.nganxephangdoi;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while (n > 0){
            s = (char) (n %10 + '0') + s;
            n = n/10;
        }
        System.out.println(s);
    }
}
