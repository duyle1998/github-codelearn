package Huongdt.Bai51;

public class Bai52 {
    public static void main(String[] args) {
        QueInt queInt = new QueInt(5);
        int count;
        for(int i = 0; i <= 10; i++){
            queInt.put(i);
        }
        System.out.println("nội dung của Queint");
        for(int i = 0; i <= 12; i++){
            count = queInt.get();
            System.out.print(count+ " ");
        }
    }
}
class QueInt{
    int a[];
    int putloc , getloc;

    QueInt(int size){
        a = new int[size + 1];
        putloc = getloc = 0;
    }
    void put(int n){
        if(putloc == a.length -1){
            System.out.println("Hàng đợi đầy");
            return;
        }
        putloc++;
        a[putloc] = n;
    }
    int get(){
        if(putloc == getloc){
            System.out.println("hàng đợi rỗng");
            return 0;
        }
        getloc++;
        return a[getloc];
    }
}
