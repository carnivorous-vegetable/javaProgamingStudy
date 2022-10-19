package 실습문제3장;

import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < intArray.length; i++)
            intArray[i] = sc.nextInt();
        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] / 3 == 0) {
                System.out.print(j);
            }
        }
        sc.close();
    }
}