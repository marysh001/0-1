package Seminar6.Solid3LSP1;

import Seminar6.Solid3LSP1.lsp.*;

public class ViewShape {
    private final Shape shape;

    public ViewShape(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.printf("Area is: %d\n", shape.getArea());
    }
}
