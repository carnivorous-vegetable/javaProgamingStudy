package 실습문제2장;

import java.util.Scanner;

public class study1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt();
        int seconds = time % 60;
        int minutes = (time % 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minutes + "분, ");
        System.out.println(seconds + "초입니다.");
        scanner.close();
    }
}