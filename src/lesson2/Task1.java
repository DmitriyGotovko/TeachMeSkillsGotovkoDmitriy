package lesson2;

/**
 * Условие задачи
 */
public class Task1 {

    public static void main(String[] args) {

        int firstNumber = 1227;
        int secondNumber = 545;
        int thirdNumber = 37;

        int max = Math.max(Math.max(firstNumber,secondNumber),thirdNumber);
        int min = Math.min(Math.min(firstNumber,secondNumber),thirdNumber);
        int avg = firstNumber + secondNumber + thirdNumber - (max + min);
        System.out.println("maximum value: " + max);
        System.out.println("minimum value: " + min);
        System.out.println("avg value: " + avg);
    }
}
