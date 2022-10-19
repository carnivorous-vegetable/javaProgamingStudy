package 실습문제2장;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 정수를 입력하세요>>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.print("삼각형이 되지 않습니다");
        }
        else {
            System.out.print("삼각형이 됩니다.");
        }
        sc.close();
    }
}
