package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        boolean isEven = number % 2 == 0;
        boolean isDivideThree = number % 3 == 0;

        if (isDivideThree && isEven) {
            result = "The number divides by 6.";
        } else if (isDivideThree) {
            result = "The number divides by 3, but it isn't the even number.";
        } else if (isEven) {
            result = "The number doesn't divide by 3, but it is the even number.";
        } else {
            result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }

}