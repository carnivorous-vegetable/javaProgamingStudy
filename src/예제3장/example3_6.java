package 예제3장;

import java.util.Scanner;
public class example3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("exit를 입력하면 종료됩니다.");
        while (true) {
            System.out.print(">>");
            String text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        }
        sc.close();
    }
}
