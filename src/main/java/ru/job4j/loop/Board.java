package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {

        for (int line = 0; line < height; line++) {
            for (int column = 0; column < width; column++) {
                if ((line + column) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}