package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создание компьютера.
        RAM dellRAM = new RAM(3, "DDR3");
        CPU dellCPU = new CPU(3, 4, 1500);
        HDD dellHDD = new HDD("SSD", 1200, "Dell");
        Computer dellComputer = new Computer("Personal", 2900.34, "Dell",
                "XPS", 20, dellCPU, dellHDD, dellRAM);

        System.out.print(dellComputer);



        System.out.println("Чтобы выключить компьютер нажмите 0 или 1");
        Scanner dellOffScan = new Scanner(System.in);
        int codeOff = dellOnnScan.nextInt();
        if (codeOff == Code2) {
            System.out.println("Угадал! Ты везунчик! Компьютер выключен");
        } else {
            System.out.println("Не угадал! Компьютер СГОРЕЛ");
        }
    }
}