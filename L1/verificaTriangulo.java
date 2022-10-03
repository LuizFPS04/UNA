/* 9) Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double catetoOposto, catetoAdjacente, hipotenusa;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o valor do Cateto Oposto: ");
    catetoOposto = ler.nextDouble();
    System.out.printf("Informe o valor do Cateto Adjacente: ");
    catetoAdjacente = ler.nextDouble();

    hipotenusa = ((Math.pow(catetoOposto, 2)) + (Math.pow(catetoAdjacente, 2)));

      hipotenusa = Math.sqrt(hipotenusa);

    System.out.printf("O valor da Hipotenusa é: %.2f", hipotenusa);
  }
}