/*
Suponha que uma bola de massa qualquer seja arremessada para cima numa velocidade v0. Qual é a velocidade v(t) e sua altura acima do lançamento h(t) no instante t? A resposta, se desprezamos a resistência do ar e um conjunto de outras pequenas influências, é: v(t) = v0 - gt h(t) = v0t - gt²/2

O que acontecerá com a velocidade e altura da bola no intervalo de tempo de 0 a 2 segundos? Mostre o comportamento a cada 0,1 segundos. Desenvolva um programa em Java que mostre o resultado da velocidade e da altura da bola para cada iteração.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    double velocidade, instante, vt, ht, gravidade = 9.8;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Me informe a velocidade inicial para o arremesso: ");
    velocidade = ler.nextDouble();

    System.out.format("\nt(s)     h(t)(m)    v(t)(m/s)\n");
    
    for (instante = 0; instante <= 2.1; instante += 0.1){
      ht = velocidade * instante - (gravidade * (Math.pow(instante, 2))/2);
      vt = velocidade - (gravidade * instante);
      
      System.out.format("%.2f      %.2f         %.2f\n", instante, ht, vt);
    }
  }
}