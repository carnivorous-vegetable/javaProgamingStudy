package 실습문제2장;

import java.util.Scanner;
public class FindMiddleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("정수3개를 입력하시요>>>");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b && b < c) {System.out.print("중간 값은" + b + "입니다.");}
        if (b < a && a < c) {System.out.print("중간 값은" + a + "입니다.");}
        else { System.out.print("중간 값은" + c + "입니다.");}
        sc.close();

    }
}
