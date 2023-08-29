package SOLID.OCP.After;

public class Square implements Shape{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return getSide() * getSide();
    }
}
