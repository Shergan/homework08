package com.divashchenko;

public class Main {

    public static void main(String[] args) {
        int a = sum(3, 4, 5);
        System.out.println("A = " + a);

        int b = sum(1, 1, 1, 1, 1);
        System.out.println("B = " + b);

        int c = sum(10, 20);
        System.out.println("C = " + c);
    }

    private static int sum(int... params) {
        int result = 0;
        for (int i = 0; i < params.length; i++) {
            result += params[i];
        }
        return result;
    }
}
