package Bai73;

import java.util.Scanner;

public class Bai73 {
    public static void main(String[] args) {
        // Phương thức replace() được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char c = 'a'; c <= 'z';c++){
           s = s.replace(c + "", "");
        }
        System.out.println(s);
    }
}
