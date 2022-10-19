package 예제3장;

import java.util.Scanner;
public class example3_8 {
    public static void main(String[] args) {
        int intArray[] = new int[5];
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("정수 5개를 입력하시오");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = input.nextInt();
        }
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("평균은 " + (double) sum / intArray.length);
        input.close();
    }
}
