package com.bilalbrohilab1;

public class App {
    public static void main(String[] args) {

        Binary a = new Binary("1010");
        Binary b = new Binary("110");

        System.out.println("A = " + a.getValue());
        System.out.println("B = " + b.getValue());

        System.out.println("ADD: " + Binary.add(a, b).getValue());
        System.out.println("OR : " + Binary.or(a, b).getValue());
        System.out.println("AND: " + Binary.and(a, b).getValue());
        System.out.println("MUL: " + Binary.multiply(a, b).getValue());
    }
}
