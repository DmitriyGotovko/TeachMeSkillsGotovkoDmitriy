package Lesson3;

public abstract class Computer {
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;

    public abstract void TurnOnn();
    public abstract void TurnOff();

    static class RAM{
      int capacityRam;
      String typeRAM;
    }

    static class CPU{
        int clockFrequency;
        int coreCount;
        int cahseSize;

    }

    static class HDD{
        String typeHDD;
        int capacityHDD;
        String brandHDD;

    }
}