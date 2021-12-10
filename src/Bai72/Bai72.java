package Bai72;

import java.util.Locale;
import java.util.Scanner;

public class Bai72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuỗi a ");
        String s1 = sc.next();
        System.out.println("nhập chuỗi b");
        String s2 = sc.next();
        String s3 = s2.toLowerCase();
        System.out.println(s1.indexOf(s3));

    }
}
