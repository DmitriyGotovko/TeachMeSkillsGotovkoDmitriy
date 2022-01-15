package lesson2;

public class Task4 {
    public static void main(String[] args) {

        int num1 = 45;
        byte num2 = 0b1100100;
        short num3 = 0b11001000;
        long num4 = 0b110010000;
        float num6 = 40.7f;
        double num7 = 98.5;
        char num8 = 202;

        int num5 = (int) num4 * num3;
        double num9 = num7/num6;
        boolean num10 = num1>=num2;
        boolean num11 = num1<num2;
        boolean A = num10&num11;

        System.out.println(num10);
        System.out.println(num11);
        System.out.println(A);
    }
}