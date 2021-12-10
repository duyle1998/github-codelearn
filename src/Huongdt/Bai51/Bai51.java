package Huongdt.Bai51;
public class Bai51 {


    public static void main(String[] args) throws java.io.IOException {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char eh;

        System.out.println("sử dụng bigQ để lưu trữ bảng chữ cái");
        for(int i = 0; i < 26; i++){
            bigQ.put((char) ('A'+ i));
        }
        System.out.print("nội dung của bigQ là: ");
        for (int i = 0; i < 26; i++){
            eh = bigQ.get();
            if(eh != (char) 0){
                System.out.print(eh+ " ");
            }
        }
        // smallQ
        for(int i = 0; i < 5; i++){
            System.out.println("cố gắng lưu trữ " + (char) ('Z' - i));
            System.out.println();
        }
        System.out.println("Nội dung của smallQ");
        System.out.println();
        for(int i = 0 ; i < 5; i++){
            eh = smallQ.get();
            if(eh != (char) 0){
                System.out.print(eh);
            }
        }
    }
}
class Queue{
    char q[]; // mảng lưu chữ hàng đợi
    int putloc, getloc; // chỉ số nhập và lấy

    Queue(int size){
        q = new char[size + 1]; // cấp phát bộ nhớ cho hàng đợi
        putloc = getloc = 0; //
    }
    // chèn 1 kí tự cho hàng đợi
    void put(char ch){
        if( putloc == q.length -1){
            System.out.println("hàng đợi đầy");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    // lấy 1 kí tự từ hàng đợi
    char get(){
        if(getloc == putloc){
            System.out.println("Hàng đợi rỗng");
            return  0;
        }
        getloc++;
        return q[getloc];
    }
}










