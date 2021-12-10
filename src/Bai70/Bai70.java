package Bai70;

import java.util.Scanner;

public class Bai70 {
    public static void main(String[] args){
       // Cho xâu s và ký tự c được nhập từ bàn phím,
        // bạn hãy viết chương trình in ra vị trí đầu tiên mà ký tự c xuất hiện trong xâu s,
        // nếu ký tự c không xuất hiện trong s thì in ra -1.
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi s");
        String s = sc.next();
        System.out.println("mời bạn nhập kí tự cần tìm");
        int answer = -1;
        char c = sc.next().charAt(0);
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == c){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
