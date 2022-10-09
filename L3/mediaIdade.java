/*
Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre: 
  - a quantidade de pessoas com mais de 90 kg
  - a média das idades das sete pessoas
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    int contador = 0;
    float peso, idade, somaIdade = 0, media = 0;

    Scanner ler = new Scanner(System.in);

    for (int i = 1; i <= 7; i++) {
      System.out.printf("\nInforme a idade da %d° pessoa: ", i);
      idade = ler.nextInt();

      somaIdade += idade;
      media = somaIdade / i;

      System.out.printf("Agora, me informe o peso da %d° pessoa: ", i);
      peso = ler.nextFloat();

      if (peso > 90) {
        contador++;
      }
    }
    System.out.printf("\nExistem %d pessoa(s) com mais de 90kg!", contador);

    System.out.printf("\nA média de idade das pessoas é igual a %.2f: ", media);
  }
}