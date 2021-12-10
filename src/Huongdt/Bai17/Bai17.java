package Huongdt.Bai17;

public class Bai17 {
    public static int maxOfArray(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length;i++){
           if(max <= arr[i]){
               max = arr[i];
           }
        }
        return max;
    }
    public static double sumOfArray(double arr[]){
        double tong = 0;
        for(int i = 0;i < arr.length;i++){
            tong += arr[i];
        }
        return tong;
    }
    public static void main(String[] args){
        int arr1 [] = new int[] {4,4,2};
//        double arr2[] = new double[] {1.3,4.2,6.7};
        System.out.println(Bai17.maxOfArray(arr1));
//        System.out.println(Bai17.sumOfArray(arr2));
    }
}
