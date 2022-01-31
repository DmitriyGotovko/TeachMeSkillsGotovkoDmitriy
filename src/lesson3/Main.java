package lesson3;

/**Main создавать компьютеры и работать с ними.
 Computer :
 Ram:
 int capacity
 String type
 Cpu:
 Int тактовая частота
 Int coreCount
 Int cahseSize
 Hdd:
 String type (sdd\hdd)
 Int capacity
 String brand
 String type (laptop\desktop)
 double cost
 String brand
 String model
 Int maxWokringCount

 Методы:
 1)	включить, при включении может произойти сбой, при вызове метода
 рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
 угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
 включить нужно выдать сообщение что ему конец
 2)	выключить (аналогично включению)
*/

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Создание компьютера.
        RAM dellRAM = new RAM(3, "DDR3");
        CPU dellCPU = new CPU(3, 4, 1500);
        HDD dellHDD = new HDD("SSD", 1200, "Dell");
        Computer dellComputer = new Computer("Personal", 2900.34, "Dell",
                "XPS", 20, dellCPU, dellHDD, dellRAM);

        System.out.println(dellComputer);

        int codeOneDell = (int) (Math.random() * 2);
        int codeTwoDell = (int) (Math.random() * 2);

        if (dellHDD != null) {
            System.out.println("Чтобы включить компьютер нажмите 0 или 1");
        } else {
            System.out.println("Отсутсвует HDD. Включение невозможно.");
        }
        Scanner dellScan = new Scanner(System.in);
        int codeOnn = dellScan.nextInt();
        if (codeOnn == codeOneDell) {
            System.out.println("Угадал! Ты везунчик! Компьютер включен.");
        } else {
            System.out.println("Не угадал! Компьютер СГОРЕЛ");
            dellScan.close();
        }
        System.out.println("Чтобы выключить компьютер нажмите 0 или 1");
        int codeOff = dellScan.nextInt();
            if (codeOff == codeTwoDell){
                System.out.println("Пока! Компьютер выключен.");
            } else {
                System.out.println("Не угадал! Компьютер СГОРЕЛ");
            }
        }
    }
