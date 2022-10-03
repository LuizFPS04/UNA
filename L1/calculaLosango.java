/* 5) Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double diagonalMaior, diagonalMenor, areaTotal;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o tamanho da Diagonal Maior: ");
    diagonalMaior = ler.nextDouble();
    System.out.printf("Informe o tamanho da Diagonal Menor: ");
    diagonalMenor = ler.nextDouble();

    areaTotal = (diagonalMaior * diagonalMenor)/2;

    System.out.printf("A Área Total do Losango é: %.2f", areaTotal);
  }
}