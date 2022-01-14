package com.company;

public class Main {

    public static void main(String[] args) {

        Person p = new Son();
        System.out.println(p.str);
        p.method();
        System.out.println(p.staticStr);
        p.staticMethod();
    }
}
