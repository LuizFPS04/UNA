/* 3) Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double cotacao, valorDolares, valorReais;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe a cotação atual de dólar para o real: ");
    cotacao = ler.nextDouble();
    System.out.printf("🤑 Informe o tanto de dólares que você tem no bolso: ");
    valorDolares = ler.nextDouble();

    valorReais = (valorDolares*cotacao);

    System.out.printf("🤑 Você possui R$ %.2f", valorReais);
  }
}