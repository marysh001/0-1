package Seminar6.Solid3LSP1;

import Seminar6.Solid3LSP1.lsp.*;

public class Main {
    public static void main(String[] args) {
        Square shape1 = new Square(5);
        shape1.setSide(4);
        System.out.printf("The side of square = %d\n", shape1.getSide());
        ViewShape view = new ViewShape(shape1);
        view.showArea();
    }
}
