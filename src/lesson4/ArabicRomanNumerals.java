package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Создайте набор пар арабское – римское O, I, V, X, M
 * Напишите метод по переводу арабских чисел от 0 до 100 в римские используя данную мапу.
 */

public class ArabicRomanNumerals {
    public static void main(String[] args) {
        Map<Integer,String> arabicRoman = new HashMap<>();
        arabicRoman.put(0, "0");
        arabicRoman.put(1,"I");
        arabicRoman.put(5,"V");
        arabicRoman.put(10,"X");
        arabicRoman.put(50,"L");
        arabicRoman.put(100,"C");

        StringBuilder romeNumber = new StringBuilder();

        Scanner converter = new Scanner(System.in);
        System.out.println("Введите число");
        int arabicNumber = converter.nextInt();
        if (arabicNumber == 0){
            romeNumber.append(arabicRoman.get(0));
        }
        while (arabicNumber >= 100){
            romeNumber.append(arabicRoman.get(100));
            arabicNumber -= 100;
        }
        while (arabicNumber >= 90){
            romeNumber.append(arabicRoman.get(10));
            romeNumber.append(arabicRoman.get(100));
            arabicNumber -= 90;
        }
        while (arabicNumber >= 50){
            romeNumber.append(arabicRoman.get(50));
            arabicNumber -= 50;
        }
        while (arabicNumber >= 40){
            romeNumber.append(arabicRoman.get(10));
            romeNumber.append(arabicRoman.get(50));
            arabicNumber -= 40;
        }
        while (arabicNumber >= 10){
            romeNumber.append(arabicRoman.get(10));
            arabicNumber -= 10;
        }
        while (arabicNumber >= 9){
            romeNumber.append(arabicRoman.get(1));
            romeNumber.append(arabicRoman.get(10));
            arabicNumber -= 9;
        }
        while (arabicNumber >= 5){
            romeNumber.append(arabicRoman.get(5));
            arabicNumber -= 5;
        }
        while (arabicNumber >= 4){
            romeNumber.append(arabicRoman.get(1));
            romeNumber.append(arabicRoman.get(5));
            arabicNumber -= 5;
        }
        while (arabicNumber >= 1){
            romeNumber.append(arabicRoman.get(1));
            arabicNumber -= 1;
        }
        System.out.println("Римское: " + romeNumber);
    }
}
