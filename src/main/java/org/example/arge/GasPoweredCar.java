package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders, String name, String description) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
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
