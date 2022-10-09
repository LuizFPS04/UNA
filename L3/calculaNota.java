/*
Faça um programa que receba as 2 notas de 3 alunos, e para cada aluno, imprima sua média
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    String nome;
    float nota = 0, nota2 = 0, media = 0;

    Scanner ler = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {
      System.out.printf("\nInforme o nome do %d° aluno: ", i);
      nome = ler.next();
      
      for (int j = 1; j <= 2; j++) {
        System.out.printf("Agora, me informe a %d° nota do(a) aluno %s: ", j, nome);
        nota = ler.nextFloat();
        
        if (j == 1){
          nota2 = nota;
        }
        media = (nota2 + nota)/j;
      }
      System.out.printf("\n%s teve uma média igual a: %.2f\n", nome, media);
    }
  }
}