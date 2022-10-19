package 실습문제2장;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        char grade;

        System.out.print("점수를 입력하세요: ");
        int score = Scanner.nextInt();
        if (score >= 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 60) {
            grade = 'D';
        }else {
            grade = 'A';
        }
        System.out.print("학점은 " + grade + " 입니다.");
    }
}
