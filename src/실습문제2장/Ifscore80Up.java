package 실습문제2장;

import java.util.Scanner;

public class Ifscore80Up {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요");
        int score = scanner.nextInt();
        if (score >= 80) {
            System.out.println("합격입니다!");

            scanner.close();
        }
        else {
            System.out.println("불합격입니다.");
        }

    }
}
