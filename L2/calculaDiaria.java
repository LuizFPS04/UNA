/*11) Um hotel possui a seguinte tabela para cobrança da diária de seus clientes:

Faça um programa que leia a tipo de apartamento e a quantidade de dias em que um hóspede esteve no hotel, e calcule o total a ser pago pelo mesmo.
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    int escolha, qtdDias;
    double totalReserva;

    Scanner ler = new Scanner(System.in);

    System.out.println("Informe em qual apartamento você se hospedou: ");
    System.out.println("[1] Apto Simples");
    System.out.println("[2] Apto Duplo");

    escolha = ler.nextInt();

    if ((escolha != 1) && (escolha != 2)) {
      System.out.printf("Opção inválida!");
    } else {
      System.out.printf("Agora, me informe a quantidade de dias que você ficou hospedado: ");
      qtdDias = ler.nextInt();

      if (escolha == 1) {
        if ((qtdDias > 0) && (qtdDias < 10)) {
          totalReserva = qtdDias * 100;
          System.out.printf("Como você ficou hospedado por %d dia(s), você irá pagar R$ %.2f", qtdDias, totalReserva);
        } else if ((qtdDias >= 10) && (qtdDias <= 15)) {
          totalReserva = qtdDias * 90;
          System.out.printf("Como você ficou hospedado por %d dia(s), você irá pagar R$ %.2f", qtdDias, totalReserva);
        } else if (qtdDias > 15) {
          totalReserva = qtdDias * 80;
          System.out.printf("Como você ficou hospedado por %d dia(s), você irá pagar R$ %.2f", qtdDias, totalReserva);
        } else {
          System.out.printf("Você não se hospedou aqui em nenhum dia!");
        }

      } else if (escolha == 2) {
        if ((qtdDias > 0) && (qtdDias < 10)) {
          totalReserva = qtdDias * 140;
          System.out.printf("Como você ficou hospedado por %d dia(s), você irá pagar R$ %.2f", qtdDias, totalReserva);
        } else if ((qtdDias >= 10) && (qtdDias <= 15)) {
          totalReserva = qtdDias * 120;
          System.out.printf("Como você ficou hospedado por %d dia(s), você irá pagar R$ %.2f", qtdDias, totalReserva);
        } else if (qtdDias > 15) {
          totalReserva = qtdDias * 100;
          System.out.printf("Como você ficou hospedado por %d dia(s), você irá pagar R$ %.2f", qtdDias, totalReserva);
        } else {
          System.out.printf("Você não se hospedou aqui em nenhum dia!");
        }
      }
    }
  }
}