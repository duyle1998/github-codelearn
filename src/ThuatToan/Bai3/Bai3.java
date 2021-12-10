package ThuatToan.Bai3;

public class Bai3 {
    public static void main(String[] args){
        String input = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
        int index = 0;
        int tongle = 0;
        int tongchan = 0;

        for(int i = 0; i < input.length();i++){
            int a = Integer.parseInt(String.valueOf(input.charAt(index)));
            if(a % 2 == 0){
                tongchan += a;
            }else{
                tongle += a;
            }
            index++;
            }
        System.out.println(tongle +" - "+tongchan +" = "+ (tongle - tongchan));


        }

    }

