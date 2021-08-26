package com.company;

import com.company.model.Calculos;
import com.company.model.PracticaExcecoes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("------------------ Exercício 1-1 ---------------------");

        PracticaExcecoes.calculoQuociente(300, 0);

        System.out.println("------------------ Exercício 1-2 ---------------------");

        PracticaExcecoes.division(300, 0);

        System.out.println("------------------ Exercício 2 ---------------------");

        PracticaExcecoes.exercicio2();

        System.out.println("------------------ Exercício 3 - IOException ---------------------");

        PracticaExcecoes.lerArquivo("AulaExcecoes");

        System.out.println("------------------ Exercício 3 - FileNotFoundException ---------------------");

        PracticaExcecoes.lerArquivo2("AulaExcecoes");

        System.out.println("------------------ Exercício 4 ---------------------");

        Calculos.minimo();
        Calculos.maximo();
        Calculos.potencia();
        Calculos.cosseno();
        Calculos.raiz();
        Calculos.aleatorio();
    }
}