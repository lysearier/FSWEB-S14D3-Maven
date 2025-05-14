package org.example.company;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        return getClass().getSimpleName() + ": the car's engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ": the car is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + ": the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        if (this == car) return true;
        if (car == null || getClass() != car.getClass()) return false;
        Car carObj = (Car) car;
        return cylinders == carObj.cylinders && name.equals(carObj.name);
    }

}
