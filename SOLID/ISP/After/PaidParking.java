package SOLID.ISP.After;

public interface PaidParking extends Parking{
    double calculateFee(Car car);
    void doPayment(Car car);
}
