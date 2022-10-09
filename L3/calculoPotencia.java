/*
Faça um programa que leia dois números inteiros que imprima a potência do primeiro elevado ao segundo, utilizando somente operadores de multiplicação
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    int numeroBase, numeroExpoente, resultado = 1;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Digite um valor para base: ");
    numeroBase = ler.nextInt();
    
    System.out.printf("Agora, digite um valor para ser o expoente: ");
    numeroExpoente = ler.nextInt();

    for (int i = 0; i < numeroExpoente; i++) {
      resultado *= numeroBase;
    }
    System.out.printf("O valor de %d elevado a %d, é: %d", numeroExpoente, numeroBase, resultado);
  }
}