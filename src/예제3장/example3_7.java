package 예제3장;

import java.util.Scanner;
public class example3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intArry[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하시오");
        for (int i = 0; i < 5; i++) {
            intArry[i] = input.nextInt();
            if (intArry[i] > max) {
                max = intArry[i];
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        input.close();
    }
}
