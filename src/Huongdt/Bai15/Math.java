package Huongdt.Bai15;
public class Math{
    public static double Pi = 3.14;

    public static int abs(int x){
        return x < 0 ? -x : x;
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtrack(int x, int y){
        return x - y;
    }
    public static int min(int x, int y){
        return x < y ? x : y;
    }
    public static int max(int x, int y){
        return x > y ? x : y;
    }
    public static int pow(int x, int y){
        int a = 1;
        for(int i = 1; i <= y; i++){
            a *= x;
        }
        return a;
    }

}
class Entry{
    public static void main(String[] args){
        System.out.println(Math.Pi);
        System.out.println(Math.abs(-2));
        System.out.println(Math.subtrack(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.pow(-2, 2));

    }
}
