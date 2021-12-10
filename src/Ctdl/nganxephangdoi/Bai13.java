package Ctdl.nganxephangdoi;

import java.util.Scanner;
import java.util.Stack;

public class Bai13 {
    public static void main(String[] args){
//                size : trả về kích thước hiện tại của stack.
//                empty : true stack nếu rỗng, và ngược lại.
//                push : đẩy phần tử vào stack. .
//                pop : loại bỏ phẩn tử ở đỉnh của stack.
//                top : truy cập tới phần tử ở đỉnh stack.

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i <a.length(); i++){
            stack.push(a.charAt(i));

        }

        while(stack.isEmpty() == false){
            System.out.print(stack.pop());
        }




    }


}
