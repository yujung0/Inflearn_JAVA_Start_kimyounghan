package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        // 홀수 짝수 찾기
        int x = 5;
        int even = (x % 2);

        String status = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + "," + status);
    }
}
