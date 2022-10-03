/*9) Um determinado hotel cobra R$ 500,00 a diária e mais uma taxa de serviços. Faça um programa que leia o número de diárias e calcule o total a ser pago pelo cliente, sabendo-se que a taxa de serviços é de:
 - R$ 15,00 por dia, se número de diárias < 15
 - R$ 10,00 por dia, se número de diárias = 15
 - R$ 5,00 por dia, se número de diárias > 15
 */

import java.util.*;

class Main {
  public static void main(String[] args) {
    int qtdDias;
    double totalReserva;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Por favor, me informe a quantidade de dias que você deseja se hospedar em nosso hotel: ");
    qtdDias = ler.nextInt();

    if ((qtdDias > 0) && (qtdDias < 15)) {
      totalReserva = 500 + (15 * qtdDias);
      System.out.printf("O valor total da sua reserva de %d dia(s), com a nossa taxa de serviço, será: R$ %.2f", qtdDias, totalReserva);
    } else if (qtdDias == 15) {
      totalReserva = 500 + (10 * qtdDias);
      System.out.printf("O valor total da sua reserva de %dia(s), com a nossa taxa de serviço, será: R$ %.2f", qtdDias, totalReserva);
    } else if (qtdDias > 15){
      totalReserva = 500 + (5 * qtdDias);
      System.out.printf("O valor total da sua reserva de %d dia(s), com a nossa taxa de serviço, será: R$ %.2f", qtdDias, totalReserva);
    }
    else {
      System.out.printf("Você não se hospedou aqui em nenhum dia!");
    }
  }
}