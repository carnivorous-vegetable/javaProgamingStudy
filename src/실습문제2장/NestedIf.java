package 실습문제2장;

import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학년을 입력하세요 : ");
        int year = scanner.nextInt();
        System.out.print("점수를 입력하세요 : ");
        double score = scanner.nextDouble();

        if (score >= 60) {
            if (year != 4) {
                System.out.println("합격!");
            }
            else if(score >= 70) {
                System.out.println("합격!");
            }else {
                System.out.println("불합격!");
            }
        }
        scanner.close();
    }
}
