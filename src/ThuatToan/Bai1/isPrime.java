package ThuatToan.Bai1;

import java.util.Scanner;



class isPrime {
    static boolean check_prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n [] = {2,3,4,5,6};
      for(int i = 0; i < n.length; i++){
          if(check_prime(n[i])){
              System.out.print(n[i] + " ");
          }
      }

    }
}





