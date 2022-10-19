package 실습문제3장;

import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

