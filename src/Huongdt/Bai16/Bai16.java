package Huongdt.Bai16;

public class Bai16 {
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int max(int a, int b,int c){
        return max(max(a,b),c);
    }
    public static double max(int a, int b,int c,int d){
        return max(max(max(a,b),c),d);
    }
    public static void main(String[] args){
        System.out.println(Bai16.max(10,4,6,8));
        System.out.println(Bai16.max(5,4));
    }
}
