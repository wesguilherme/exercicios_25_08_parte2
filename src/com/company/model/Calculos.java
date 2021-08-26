package com.company.model;

import java.lang.Math;

public class Calculos {

    public static void maximo() {
        double a = 3d;
        double b = 5d;
        System.out.println(Math.max(a, b));
    }

    public static void minimo() {
        double a = 3d;
        double b = 5d;
        System.out.println(Math.min(a, b));
    }

    public static void potencia() {
        double a = 3d;
        double b = 5d;
        System.out.println(Math.pow(a, b));
    }

    public static void cosseno() {
        double a = 180d;

        double a1 = Math.toRadians(a);

        System.out.println("Math.cos(" + a + ")=" + Math.cos(a1));
    }

    public static void raiz() {
        double a = 16d;

        System.out.println(Math.sqrt(a));
    }

    public static void aleatorio() {
        double aleatorio = Math.random() * 1000;
        System.out.printf("Número aleatório: %.0f\n", +aleatorio);
    }
}
