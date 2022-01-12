package shape;

import resizableShape.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide () {
        return getWidth();
    }

    public void setSide (double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + "which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        double scale = percent/100;
        setSide(getSide() * scale);
    }
}