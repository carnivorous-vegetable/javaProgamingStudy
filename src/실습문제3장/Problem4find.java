package 실습문제3장;

import java.util.Scanner;
public class Problem4find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파멧 하나를 입력하시오>>");
        char alpha = sc.next().charAt(0);
        for (int i = 0; i <= alpha - 'a'; i++) {
            for (char j = 'a'; j <= alpha - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
