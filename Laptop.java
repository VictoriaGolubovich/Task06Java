package HW6;

import java.util.Objects;

public class Laptop {
    private int randomAccessMemory;
    private int hardDriveCapacity;
    private String operatingSystem;
    private String color;

    public Laptop(int randomAccessMemory, int hardDriveCapacity, String operatingSystem, String color) {
        this.randomAccessMemory = randomAccessMemory;
        this.hardDriveCapacity = hardDriveCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getOS() {
        return operatingSystem;
    }

    public void setOS(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRAM() {
        return randomAccessMemory;
    }

    public void setRAM(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public int getHDC() {
        return hardDriveCapacity;
    }

    public void setHDC(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ОЗУ=" + randomAccessMemory + 
                ", объем ЖД=" + hardDriveCapacity +
                ", операционная система='" + operatingSystem + '\'' +
                ", цвет='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return operatingSystem.equals(laptop.operatingSystem) && randomAccessMemory == laptop.randomAccessMemory && hardDriveCapacity == laptop.hardDriveCapacity && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(randomAccessMemory,hardDriveCapacity,operatingSystem,color);
    }
}