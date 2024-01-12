package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiperimeterTriangle = (a + b + c) / 2;
        double result = Math.sqrt(semiperimeterTriangle * (semiperimeterTriangle - a) * (semiperimeterTriangle - b)
                * (semiperimeterTriangle - c));
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }

}