/* Faça um programa que calcule e mostre a tabuada de multiplicação de um número digitado pelo usuário. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    int valor, resultado;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o valor inicial para sua tabuada: ");
    valor = ler.nextInt();

    System.out.printf("\nA tabuada de %d é: \n\n", valor);

    resultado = valor * 1;
    System.out.printf("%d X 1 = %d\n", valor, resultado);
    resultado = valor * 2;
    System.out.printf("%d X 2 = %d\n", valor, resultado);
    resultado = valor * 3;
    System.out.printf("%d X 3 = %d\n", valor, resultado);
    resultado = valor * 4;
    System.out.printf("%d X 4 = %d\n", valor, resultado);
    resultado = valor * 5;
    System.out.printf("%d X 5 = %d\n", valor, resultado);
    resultado = valor * 6;
    System.out.printf("%d X 6 = %d\n", valor, resultado);
    resultado = valor * 7;
    System.out.printf("%d X 7 = %d\n", valor, resultado);
    resultado = valor * 8;
    System.out.printf("%d X 8 = %d\n", valor, resultado);
    resultado = valor * 9;
    System.out.printf("%d X 9 = %d\n", valor, resultado);
    resultado = valor * 10;
    System.out.printf("%d X 10 = %d\n", valor, resultado);
  }
}