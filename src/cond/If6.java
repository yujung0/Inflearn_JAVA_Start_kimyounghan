package cond;

public class If6 {
    public static void main(String[] args) {

        // 나의 풀이
//        int itemPrice = 5000;
//        int age = 15;
//        int discount = -1000;
//
//        if (itemPrice <= 10000 && age <= 10) {
//            System.out.println("동시 할인가 : " + (itemPrice + (discount * 2)));
//        } else if (itemPrice <= 10000 || age <= 10) {
//            System.out.println("할인가 : " + (itemPrice + discount));
//        }
        // 할인가가 적용 된 최종 금액을 구했음

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount + "원");
    }
}
