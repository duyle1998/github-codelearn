package Ctdl.nganxephangdoi;


import java.util.Scanner;
import java.util.Stack;

public class Bai14 {


    public static void main(String[]args){
        // Nhập vào một số nguyên dương n.
        //
        //Hãy chuyển n thành mã nhị phân và in chuỗi đó ra màn hình.
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập vào 1 số");
        int n = sc.nextInt();
        while (n != 0){
            int d = n % 2;
            stack.push(d);
            n = n /2;
        }
        System.out.println("Nhị phân :");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }



    }
}
