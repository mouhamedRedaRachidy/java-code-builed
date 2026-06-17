package com.rachidy;

public class Calculator {
    public static String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int maynes(int a, int b) {
        return a - b;
    }

    public static int derb(int a, int b) {
        return a * b;
    }

    public static int qisma(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
