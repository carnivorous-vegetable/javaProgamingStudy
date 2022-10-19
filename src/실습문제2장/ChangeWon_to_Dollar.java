package 실습문제2장;

import java.util.Scanner;

public class ChangeWon_to_Dollar {
    public static void main(String[] args) {

        double dollar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>>");
        double won = scanner.nextDouble();
        dollar = (won / 1100);

        System.out.println(won + "원은 $" + dollar + "입니다.");
    }
}
