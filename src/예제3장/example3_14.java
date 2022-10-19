package 예제3장;

import java.util.Scanner;
public class example3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하시오:");
        dividend = input.nextInt();
        System.out.print("나눗수를 입력하시오:");
        divisor = input.nextInt();
        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "
                + dividend / divisor + "입니다.");
        input.close();
    }
}
