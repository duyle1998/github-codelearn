package Huongdt.Static;

 class Static1 {
     public static double Pi = 3.14;
     public static int abs(int x){
         return x < 0 ? -x : x;
     }
     public static int add(int x, int y){
         return x+y;
     }
     public static int subtrack(int x, int y){
         return x-y;
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
             a = a*x;
         }
        return a;
     }
}

public class Static{
    public static void main(String[] args){
        System.out.println("PI: "+Static1.Pi);
    System.out.println("Tri tuyet doi: "+Static1.abs(-2));
        System.out.println("MAX: "+Static1.max(5,8));
        System.out.println("Min: "+Static1.min(10,3));
        System.out.println("Cong: "+Static1.add(50,50));
        System.out.println("tru: "+Static1.subtrack(50,45));
        System.out.println("POW: "+Static1.pow(5,3));


    }
        }
