/* 4) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double salarioAtual, salarioAumento;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe seu salário: ");
    salarioAtual = ler.nextDouble();

    salarioAumento = salarioAtual * 1.25;

    System.out.printf("Tá patrão chefe! \nCom seu aumento, agora você irá receber: R$ %.2f", salarioAumento);
  }
}