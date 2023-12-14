package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        // 환율 계산하기

        int dollar = -5;
        int exchange = dollar * 1300;

        if (dollar < 0) {
            System.out.println("dollar : " + dollar + "\n출력 : 잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("dollar : " + dollar + "\n출력 : 환전할 금액이 없습니다.");
        } else {
            System.out.println("dollar : " + dollar + "\n출력 : 환전 금액은 " + exchange + "원 입니다.");
        }

    }
}
