package com.company.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticaExcecoes extends RuntimeException {


    int a = 0;
    int b = 300;

    public static void calculoQuociente(int a, int b) {
        try {
            double quociente = b / a;
        } catch (ArithmeticException exception) {
            System.out.println("Ocorreu um erro" + exception.getMessage());
        } finally {
            System.out.println("Não pode ser dividido por zero");
        }
    }

    public static void division(int a, int b) {
        try {
            if (b == 0) {
                throw new IllegalArgumentException();
            } else {
                double result = a / b;
                System.out.println(result);
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Não pode ser dividido por zero!");
        }
    }

    public static void exercicio2() {
        String mensagemFinal = "Esta é a ultima mensagem";


        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensagemFinal);
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException {

        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo especificado");
        }
    }

    public static void lerArquivo2(String nomeArquivo) throws IOException {
        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo especificado não foi encontrado");
        }
    }

}