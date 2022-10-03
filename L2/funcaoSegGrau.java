/* 11) Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau, e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double coeficienteA, coeficienteB, coeficienteC, delta, raizA, raizB;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o valor do coeficiente A: ");
    coeficienteA = ler.nextDouble();
    System.out.printf("Informe o valor do coeficiente B: ");
    coeficienteB = ler.nextDouble();
    System.out.printf("Informe o valor do coeficiente C: ");
    coeficienteC = ler.nextDouble();

    delta = Math.pow((coeficienteB), 2) - (4 * (coeficienteA) * (coeficienteC));

    raizA = ((-coeficienteB) + (Math.sqrt(delta)))/(2 * (coeficienteA));
    raizB = ((-coeficienteB) - (Math.sqrt(delta)))/(2 * (coeficienteA));


    System.out.print("O valor das raízes são: %.2f e %.2f", raizA, raizB);
  }
}