/* 1) Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    float nota1, nota2, nota3, mediaFinal;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe a nota da sua 1° atividade: ");
    nota1 = ler.nextFloat();
    System.out.printf("Informe a nota da sua 2° atividade: ");
    nota2 = ler.nextFloat();
    System.out.printf("Informe a nota da sua 3° atividade: ");
    nota3 = ler.nextFloat();

    mediaFinal = ((nota1 + nota2 + nota3) / 3);

    System.out.printf("Sua média é de: %.2f pontos", mediaFinal);
  }
}