package lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Computer {

    public static final Scanner SCANNER = new Scanner(System.in);
    private CPU cpu;
    private HDD hdd;
    private RAM ram;
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;

    public Computer(String type, double cost, String brand, String model, int maxWorkingCount,
                    CPU cpu, HDD hdd, RAM ram) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxWorkingCount=" + maxWorkingCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.cost, cost) == 0 && maxWorkingCount == computer.maxWorkingCount &&
                Objects.equals(cpu, computer.cpu) && Objects.equals(hdd, computer.hdd) &&
                Objects.equals(ram, computer.ram) && Objects.equals(type, computer.type) &&
                Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, hdd, ram, type, cost, brand, model, maxWorkingCount);
    }
}

  /**  public void turnOn(){

        //random
        System.out.println("Для включения компьютера нажмите 0 или 1");

        int codeOnn = SCANNER.nextInt();
        if (codeOnn == Code1) {
            System.out.println("Угадал! Ты везунчик! Компьютер включен");
        } else {
            System.out.println("Не угадал! Компьютер СГОРЕЛ");
        }
    }

    public void turnOff(){

    }
}
*/