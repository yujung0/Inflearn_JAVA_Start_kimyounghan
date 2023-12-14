package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        // 더 큰 숫자 찾기
        
        int a = 10;
        int b = 20;

        int status = (a > b) ? a : b;
        System.out.println("더 큰 값은 " + status + " 입니다.");
    }
}
