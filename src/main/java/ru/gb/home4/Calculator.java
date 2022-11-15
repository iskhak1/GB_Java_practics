package ru.gb.home4;

public class Calculator {

    private int a;
    private int b;
    private int c;
    private String type;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void action(int a, int b, String type) {
        this.a = a;
        this.type = type;
        this.b = b;
        switch (type) {
            case "+":
                System.out.println(plus());
                break;
            case "-":
                System.out.println(minus());
                break;
            case "*":
                System.out.println(multiply());
                break;
            case "/":
                System.out.println(difference());
                break;
        }
    }

    private int plus() {
        c = a + b;
        return c;
    }

    private int minus() {
        c = a - b;
        return c;
    }

    private int multiply() {
        c = a * b;
        return c;
    }

    private int difference() {
        c = a / b;
        return c;
    }

    public int returnBack() {
        switch (type) {
            case "+":
                c = c - b;
                break;
            case "-":
                c = c + b;
                break;
            case "/":
                c = c * b;
                break;
            case "*":
                c = c / b;
                break;

        }
        return c;
    }

}
