package 예제3장;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example3_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("3개의 정수를 입력하세요 :");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                input.nextLine();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        input.close();
    }
}

