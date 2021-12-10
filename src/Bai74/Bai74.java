package Bai74;

import java.util.Scanner;

public class Bai74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cho xâu s được nhập vào từ bàn phím,
        // bạn hãy viết chương trình hiển thị ra màn hình số các ký tự in hoa trong xâu s.
        String s = sc.next();
        int dem = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
