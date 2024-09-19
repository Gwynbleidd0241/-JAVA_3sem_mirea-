package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", "Gasoline");
        myCar.setOwnerName("Sergey Lazarenko");
        myCar.setInsuranceNumber("LSA123456");
        myCar.setEngineType("Gasoline");

        System.out.println("\nOwner: " + myCar.getOwnerName());
        System.out.println("Insurance Number: " + myCar.getInsuranceNumber());
        System.out.println("Engine Type: " + myCar.getEngineType());

        ElectricCar myElectricCar = new ElectricCar("Tesla", "LSA0241", 89);

        System.out.println("\nBattery Capacity: " + myElectricCar.getBatteryCapacity() + " kWh");
        System.out.println("Engine Type: " + myElectricCar.getEngineType());
    }
}
