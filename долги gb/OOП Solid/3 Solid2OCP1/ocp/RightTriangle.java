package Seminar6.Solid2OCP1.ocp;

public class RightTriangle implements Shape {
    private final int cathet1;
    private final int cathet2;
    private final double hypotenuse;

    public RightTriangle(int cathet1, int cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        this.hypotenuse = Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));
    }

    public int getCathet1() {
        return cathet1;
    }

    public int getCathet2() {
        return cathet2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getArea() {
        return (cathet1 * cathet2) / 2.0;
    }
}
