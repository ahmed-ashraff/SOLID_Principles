package SOLID.LSP.Before;

public class Square extends Rectangle{
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(2);
        rectangle.setHeight(5);

        // it works only for Rectangle that's violates Liskov’s Substitution Principle (Lsp)
        if (rectangle.getArea() == 10) {
            System.out.println("The Area = " + 10);
        }
    }
}
