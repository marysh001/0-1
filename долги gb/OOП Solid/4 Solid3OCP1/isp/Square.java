package Seminar6.Solid3LSP1.lsp;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
