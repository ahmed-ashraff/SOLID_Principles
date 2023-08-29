package SOLID.ISP.Before;

public interface Parking {
    void parkCar(); // Decrease empty spot count by 1
    void unParkCar(); // Increase empty spot count by 1
    int getCapacity();
    double calculateFee(Car car);
    void doPayment(Car car);
}
