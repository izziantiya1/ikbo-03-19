package mirea.PR3;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setLength(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Квадрат {" + " цвет = " + color + " заливка = " + filled + " сторона = " + getSide() +
                " площадь = " + getArea() + " периметр = " + getPerimeter() + " }";
    }
}
