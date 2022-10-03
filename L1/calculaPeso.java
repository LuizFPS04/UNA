/* 8) Faça um programa que receba o peso de uma pessoa, calcule e mostre:
 a) O seu novo peso, se a pessoa engordar 15% sobre o peso digitado
 b) O seu novo peso, se a pessoa emagrecer 20% sobre o peso digitado
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double pesoAtual, pesoMais, pesoMenos;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe seu peso: ");
    pesoAtual = ler.nextDouble();

    pesoMais = pesoAtual * 1.15;
    pesoMenos = pesoAtual * 0.8;

    System.out.printf("Se você engorda 15 porcento do seu peso, você pesará %.2f kg! \nSe você emagrecer 20 porcento do seu peso, você pesará %.2f kg!", pesoMais, pesoMenos);
  }
}