package 실습문제2장;

import java.util.Scanner;
public class Game365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>>");
        int Num = sc.nextInt();
        if (Num != 0 && Num > 1 && Num <= 99) {
            int a, b;
            a = Num / 10;
            b = Num % 10;

            if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
                System.out.print("박수짝짝");
            } else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
                System.out.print("박수짝");
            }
        }
        sc.close();
    }

}
