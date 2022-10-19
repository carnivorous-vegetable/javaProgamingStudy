package 예제3장;

import java.util.Scanner;
public class example3_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하고 마지막에 -1를 입력하세요");
        int n = sc.nextInt();
        while (n != -1) {
            sum += n;
            count++;
            n = sc.nextInt();
        }
        if (count == 0) {
            System.out.print("입력된 수가 없습니다.");
        }
        else {
            System.out.print("입력된 정수의 개수는 " + count + "개이며 평균은 " + (double)sum / count + "입니다.");
        }
        sc.close();
    }
}
