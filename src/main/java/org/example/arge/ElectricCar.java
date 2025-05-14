package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize, String name, String description) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " çalıştı.");
    }
    @Override
    public void drive() {
        runEngine();
    }
    @Override
    protected void runEngine() {

    }

}
