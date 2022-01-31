package lesson3;


public class CPU {

    int clockFrequency;
    int coreCount;
    int casheSize;

    public CPU(int clockFrequency, int coreCount, int casheSize) {
        this.clockFrequency = clockFrequency;
        this.coreCount = coreCount;
        this.casheSize = casheSize;
    }
}
