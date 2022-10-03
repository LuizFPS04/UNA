/* 10) Faça um programa que receba o raio, calcule e mostre:
 - O comprimento de uma esfera (C = 2 *  π  * R)
 - A área de uma esfera (A = π * R2)
 - O volume de uma esfera (V = ¾ *  π  * R3)
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double raio, comprimento, area, volume;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o valor do Raio da esfera: ");
    raio = ler.nextDouble();

    comprimento = (2 * Math.PI * raio);
    area = (Math.PI * (Math.pow(raio, 2)));
    volume = (4 * Math.PI * (Math.pow(raio, 3)))/3;

    System.out.printf("O comprimento da esfera é: %.2f \nA área da esfera é: %.2f \nO volume da esfera é: %.2f", comprimento, area, volume);
  }
}