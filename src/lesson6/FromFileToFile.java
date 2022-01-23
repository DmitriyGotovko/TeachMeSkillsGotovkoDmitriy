package lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * сделать программу, считывающую числа из файла, умножающую их на 10 и записывающую в другой файл
 */

public class FromFileToFile {
    public static void main(String[] args) throws FileNotFoundException {

        File fromFile = new File("fileOne");
        Scanner readFromFile = new Scanner(fromFile);
        String line = readFromFile.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbersInt = new int[5];
        int counterInt = 0;
        for (String number : numbersString) {
            numbersInt[counterInt++] = Integer.parseInt(number);
        }

        numbersInt[0] *= 10;
        numbersInt[1] *= 10;
        numbersInt[2] *= 10;
        numbersInt[3] *= 10;
        numbersInt[4] *= 10;

        File toFile = new File("fileTwo");
        PrintWriter filing = new PrintWriter(toFile);
        for (int value : numbersInt) {
            String Line = Arrays.toString(new int[]{value});
            System.out.println(Line);
            filing.println(Line);
        }
        filing.close();
    }
}
