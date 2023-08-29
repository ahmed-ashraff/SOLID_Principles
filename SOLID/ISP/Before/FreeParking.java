package SOLID.ISP.Before;

public class FreeParking implements Parking{
    @Override
    public void parkCar() {

    }

    @Override
    public void unParkCar() {

    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public double calculateFee(Car car) { // this violates the Interface Segregation Principle (Isp)
        return 0;
    }

    @Override
    public void doPayment(Car car) { // this violates the Interface Segregation Principle (Isp)
        try {
            throw new Exception("Parking lot is free");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
