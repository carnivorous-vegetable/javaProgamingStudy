package ChangeWon_Segment;
import java.util.Scanner;
public class h0203 {
    public static void main(String[] args) {
        int[] coin = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner s=new Scanner(System.in);
        System.out.println("금액을 입력하시오>>");
        int num=s.nextInt();
        for (int i=0; i<coin.length; i++) {
            System.out.println(coin[i]+"원:" + num/coin[i]);
            num%= coin[i];
        }
        s.close();
    }
}