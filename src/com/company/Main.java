package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 6,};
        Class class1 = new Class(23,"words", numbers);

        System.out.println(class1.getNumber() + "  " + class1.getWord() + "  " + Arrays.toString(numbers));
    }
}
