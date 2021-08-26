package com.company;

import com.company.model.Calculos;
import com.company.model.PracticaExcecoes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PracticaExcecoes.calculoQuociente(300, 0);
        PracticaExcecoes.division(300, 0);
        PracticaExcecoes.exercicio2();
        PracticaExcecoes.lerArquivo("AulaExcecoes");
        PracticaExcecoes.lerArquivo2("AulaExcecoes");

        Calculos.minimo();
        Calculos.maximo();
        Calculos.potencia();
        Calculos.cosseno();
        Calculos.raiz();
        Calculos.aleatorio();
    }
}