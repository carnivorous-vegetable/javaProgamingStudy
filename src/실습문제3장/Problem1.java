package 실습문제3장;

public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
