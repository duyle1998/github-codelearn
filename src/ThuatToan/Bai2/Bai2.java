package ThuatToan.Bai2;

public class Bai2 {

    public static void main(String[] args) {
        int n = 16;
        int k = 2;
        int sum = 0;
        while (n > 1) {
            while (n % k == 0) {
                sum += k;
                n /= k;
            }
            k++;

        }
        System.out.println(sum);

//    int calc(int n) {
//        int k = 2, sum = 0;
//        while(n > 1) {
//            while(n % k == 0) {
//                sum+= k;
//                n/= k;
//            }
//            k++;
//        }
//    /*
//    Hàm while(n % k == 0) nhằm tìm ra các thừa số của n: nếu n chia hết cho k thì k là thừa số của n.
//    Khi đã tìm được một thừa số, giá trị mới của n sẽ là n/k.
//    Biến calc dùng để tính tổng các thừa số k của n, khi ta tìm được 1 thừa số của n thì cộng giá trị đó vào sum
//    Và ta tiếp tục kiểm tra xem giá trị n/k này có chia hết cho k nữa không:
//    - Nếu có, dùng giá trị k hiện tại và lặp lại 2 dòng trên.
//    - Nếu không, tăng giá trị k thêm 1 trước khi lặp lại 2 dòng trên
//    => Kết quả cuối cùng thu được tổng các thừa số k của n, thể hiện bằng biến calc.
//    */
//        return sum;
//    }
//
//    int factorSum(int n)
//    {
//        while(n != calc(n))
//            n = calc(n); //yêu cầu đề bài: thay thế n bằng tổng các thừa số của nó.
//        return n;
//    }
    }
}
