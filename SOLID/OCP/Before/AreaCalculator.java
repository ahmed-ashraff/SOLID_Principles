package SOLID.OCP.Before;

public class AreaCalculator {
    public double calcArea(Object shape) {
        double res = 0;
        if (shape instanceof Square) {
            res = ((Square) shape).getSide() * ((Square) shape).getSide();
        } else if (shape instanceof Rectangle) {
            res = ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
        } // and so on for other shapes;
        return res;
    }
}
