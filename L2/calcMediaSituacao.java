import java.util.*;

class Main {
  public static void main(String[] args) {
    double nota1, nota2, nota3, media;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe a 1° nota do aluno: ");
    nota1 = ler.nextDouble();
    System.out.printf("Informe a 2° nota do aluno: ");
    nota2 = ler.nextDouble();
    System.out.printf("Informe a 3° nota do aluno: ");
    nota3 = ler.nextDouble();
  
    media = (nota1 + nota2 + nota3)/3;
 
    if ((media >= 0) && (media < 0)){
      System.out.printf("Com a média %.2f, o aluno foi reprovado!", media);
      }
    else if ((media >= 3) && (media < 7)){
      System.out.printf("Com a média %.2f, o aluno vai para o exame!", media);
    }
    else if ((media >= 7) && (media <= 10)){
      System.out.printf("Com a média %.2f, o aluno vai foi aprovado!", media);
    }
    else {
      System.out.printf("Você informou algum dado errado!"");
    }
  }
}