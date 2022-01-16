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
        Map<Integer,Character> arabicRoman = new HashMap<>();
        arabicRoman.put(1,'I');
        arabicRoman.put(5,'V');
        arabicRoman.put(10,'X');
        arabicRoman.put(50,'L');
        arabicRoman.put(100,'C');

        Character numberOne = arabicRoman.get(1);
        Character numberFive = arabicRoman.get(5);
        Character numberTen = arabicRoman.get(10);
        Character numberFifty = arabicRoman.get(50);
        Character numberOneHundred = arabicRoman.get(100);


        Scanner conversion = new Scanner(System.in);
        System.out.println("Введите число от 1, 5, 10, 50 или 100");
        int arabicNumber = conversion.nextInt();
        if (arabicNumber == 1) {
            System.out.println(numberOne);
        }else if(arabicNumber == 5){
            System.out.println(numberFive);
        }else if(arabicNumber == 10){
            System.out.println(numberTen);
        }else if(arabicNumber == 50){
            System.out.println(numberFifty);
        }else if(arabicNumber == 100){
            System.out.println(numberOneHundred);
        }else{
            System.out.println("Ведите другое число!");
        }

    }
}
