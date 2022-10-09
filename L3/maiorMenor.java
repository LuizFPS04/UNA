/*
Faça um programa que leia 10 números inteiros, e que exiba o maior e o menor número digitado
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    int numero, menor = 2147483647, maior = 0;

    Scanner ler = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
      System.out.printf("Digite o %d° valor: ", i);
      numero = ler.nextInt();

      if (numero > maior) {
        maior = numero;
      } 
      else if (menor > numero) {
        menor = numero;
      }
    }
    System.out.println("Maior valor = " + maior);

    System.out.println("Menor valor = " + menor);
  }
}