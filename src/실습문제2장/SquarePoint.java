package 실습문제2장;

import java.util.Scanner;

public class SquarePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌표(x,y)를 입력하세요>>");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((100 <= x && x <= 200) && (100 <= y && 200 >= y)) {
            System.out.print("사각형 안에 점이 있습니다");
        }
        else {
            System.out.print("사각형 안에 점이 없습니다.");
        }
    sc.close();
    }
}
