/* 7) Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double salarioMinimo, salarioFuncionario, quantidadeSalarios;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o valor do salário mínimo: ");
    salarioMinimo = ler.nextDouble();
    System.out.printf("Me informe agora, o seu salário: ");
    salarioFuncionario = ler.nextDouble();

    quantidadeSalarios = (salarioFuncionario/salarioMinimo);

    System.out.printf("No seu salário, existem %.2f salários mínimos", quantidadeSalarios);
  }
}