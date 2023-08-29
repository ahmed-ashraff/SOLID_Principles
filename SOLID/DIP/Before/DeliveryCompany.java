package SOLID.DIP.Before;

public class DeliveryCompany {
    public void sendProduct(Product product) {
        // that's violates the Dependency Inversion Principle (Dip)
        new DeliveryDriver().deliveryProduct(product);
    }
}
