package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 5;
        String status = (age >= 10) ? "성인" : "미성년자";
        
//        if (age >= 18) {
//            status = "성인";
//        } else {
//            status = "미성년자";
//        }
        System.out.println("age = " + age + ", status = " + status);
    }
}
