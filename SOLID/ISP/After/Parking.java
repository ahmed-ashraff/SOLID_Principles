package SOLID.ISP.After;

public interface Parking {
    void parkCar(); // Decrease empty spot count by 1
    void unParkCar(); // Increase empty spot count by 1
    int getCapacity();
}
