/* 5) Suponha que uma bola de massa qualquer seja arremessada para cima numa velocidade v0. Qual é a velocidade v(t) e sua altura acima do lançamento h(t) no instante t? A resposta, se desprezamos a resistência do ar e um conjunto de outras pequenas influências, é:

Escreva um algoritmo que permita que o usuário escolha um planeta em que quer jogar a bola e solicite v0 e t e, então informa as particularidades da bola (velocidade e altura).
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    int escolha;
    double velocidade, instante, vt, ht;

    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o número do planeta que você irá jogar a bola: ");
    System.out.println("[1] Mercúrio");
    System.out.println("[2] Vênus");
    System.out.println("[3] Terra");
    System.out.println("[4] Marte");
    System.out.println("[5] Júpter");
    System.out.println("[6] Saturno");
    System.out.println("[7] Urano");
    System.out.println("[8] Netuno");
    System.out.println("[9] Plutão");

    escolha = ler.nextInt();

    System.out.printf("Agora, me informe a velocidade inicial (v(0)): ");
    velocidade = ler.nextDouble();

    System.out.printf("Por fim, me informe o instante (t) em que a bola foi lançada: ");
    instante = ler.nextDouble();

    if (escolha == 1){
      System.out.println("Planeta Mercúrio: ");

      vt = velocidade - (3.7 * instante);
      ht = velocidade * instante - (3.7 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Mercúrio: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 2){
      System.out.println("Planeta Vênus: ");

      vt = velocidade - (8.8 * instante);
      ht = velocidade * instante - (8.8 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Vênus: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 3){
      System.out.println("Planeta Terra: ");

      vt = velocidade - (9.8 * instante);
      ht = velocidade * instante - (9.8 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Terra: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 4){
      System.out.println("Planeta Marte: ");

      vt = velocidade - (3.8 * instante);
      ht = velocidade * instante - (3.8 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Marte: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 5){
      System.out.println("Planeta Júpter: ");

      vt = velocidade - (26.4 * instante);
      ht = velocidade * instante - (26.4 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Júpter: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 6){
      System.out.println("Planeta Saturno: ");

      vt = velocidade - (11.5 * instante);
      ht = velocidade * instante - (11.5 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Saturno: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 7){
      System.out.println("Planeta Urano: ");

      vt = velocidade - (9.3 * instante);
      ht = velocidade * instante - (9.3 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Urano: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 8){
      System.out.println("Planeta Netuno: ");

      vt = velocidade - (12.2 * instante);
      ht = velocidade * instante - (12.2 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Netuno: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else if (escolha == 9){
      System.out.println("Planeta Plutão: ");

      vt = velocidade - (0.6 * instante);
      ht = velocidade * instante - (0.6 * (Math.pow(instante, 2))/2);

      System.out.printf("Particularidades da bola em Mercúrio: \nVelocidade = %.2f \nAltura: %.2f", vt, ht);
    }
    else {
      System.out.printf("Opção inválida!");
    }
    
  }
}