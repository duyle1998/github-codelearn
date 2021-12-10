package Huongdt;

import java.util.*;

public class Dynshapes {
    public static void main(String[] args) {
        Integer input [] =  {1,2,2,3,3,3,5}; // tạo ra 1 mảng chứa các phần tử
        List<Integer> b =  Arrays.asList(input); // ép kiểu từ mảng sang list
        Set<Integer> set = new HashSet<>(); // tạo 1 hàm set để tránh trường hợp có 3 phần tử nhưng chỉ lấy 1 thôi.
        List<Integer> c = new ArrayList<>(); // tạo ra 1 list chống để chứa các phần tử không bị chùng lặp
        int tong = 0; // tính tổng.

        for(int i = 0; i < b.size();i++){
           if(!c.contains(b.get(i))){
               c.add(b.get(i));
    // add các phần tử không bị chùng lặp vào list C
           }else{
               set.add(b.get(i));
           }
        }
        tong += set.hashCode();
        System.out.println(tong);
            }
        }
