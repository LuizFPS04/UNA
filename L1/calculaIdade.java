/* 2) Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
 - A idade da pessoa no ano atual
 - A idade que a pessoa terá em 2050
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    int anoAtual, anoNascimento, idadeAtual, idade2050;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o ano atual: ");
    anoAtual = ler.nextInt();
    System.out.printf("Informe seu ano de Nascimento: ");
    anoNascimento = ler.nextInt();

    idadeAtual = anoAtual - anoNascimento;
    idade2050 = idadeAtual + (2050 - anoAtual);

    System.out.printf("Você tem: %d anos! \nVocê terá em 2050: %d anos!", idadeAtual, idade2050);
  }
}