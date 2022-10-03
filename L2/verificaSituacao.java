/* Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double nota1, nota2, media;

    Scanner ler = new Scanner(System.in);
    
    System.out.printf("Informe a 1° nota do aluno: ");
    nota1 = ler.nextDouble();
    System.out.printf("Informe a 2° nota do aluno: ");
    nota2 = ler.nextDouble();
  
    media = (nota1 + nota2)/2;
 
    if (media >= 7){
      System.out.printf("Com a média %.2f, o aluno foi aprovado!", media);
      }
    else {
      System.out.printf("Com a média %.2f, o aluno foi reprovado!", media);
    }
  }
}