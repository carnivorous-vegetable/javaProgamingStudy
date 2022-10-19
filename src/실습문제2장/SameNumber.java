package 실습문제2장;

import java.util.Scanner;
public class SameNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두자리의 정수를 입력하세요>>>");
        int num = sc.nextInt();

        int tens = num / 10;
        int units = num % 10;

        if (tens == units) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
        }
        sc.close();
    }
}
