/*3) Faça um programa para resolver as equações de 2° grau. */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double coeficienteA, coeficienteB, coeficienteC, delta, raiz, raizA, raizB;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o valor do coeficiente A: ");
    coeficienteA = ler.nextDouble();
    System.out.printf("Informe o valor do coeficiente B: ");
    coeficienteB = ler.nextDouble();
    System.out.printf("Informe o valor do coeficiente C: ");
    coeficienteC = ler.nextDouble();

    delta = Math.pow((coeficienteB), 2) - (4 * (coeficienteA) * (coeficienteC));

    if (delta < 0){
      System.out.printf("Como o delta é menor que 0, não existe uma raíz real para essa equação! \n");
    }
    else if (delta == 0){
      raiz = (-coeficienteB)/(2 * coeficienteA);
      System.out.printf("Como o delta é igual a 0, a raíz real para a equação é: %.2f! \n", raiz);
   }
    else {
      raizA = ((-coeficienteB) + (Math.sqrt(delta)))/(2 * (coeficienteA));
      raizB = ((-coeficienteB) - (Math.sqrt(delta)))/(2 * (coeficienteA));

      System.out.printf("O valor das raízes são: %.2f e %.2f! \n", raizA, raizB);
    }
  }
}