/*
Faça um programa que leia a idade e o sexo de 10 pessoas, e mostre
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    int idade, sexo, contador = 0;

    Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++){
      System.out.println("Informe o sexo: ");
      System.out.println("[1] Masculino");
      System.out.println("[2] Feminino");
			sexo = ler.nextInt();
      
      System.out.printf("Informe a idade da %d° pesoa: ", i);
			idade = ler.nextInt();
      
      if ((sexo != 1) && (sexo != 2)){
        System.out.print("Informe uma opção válida!");
      }
      else if((sexo == 2) && (idade > 20) && (idade < 40)){
        contador++;
      }
    }
    System.out.printf("Existe(m) %d mulher(es) entre 20 e 40 anos!", contador);
	}
}