import java.util.*;

class Main {
  public static void main(String[] args) {
    int numVitorias;
    String personagens[] = { "CHUNLY", "ZAGUIEF", "BLANKA", "GUILE", "RYU", "DHALSIM" };
  
    Scanner ler = new Scanner(System.in);

    System.out.println("Adversários disponíveis: \n");

    for (int i = 0; i < personagens.length; i++){
      System.out.println(personagens[i]);
    }

    System.out.printf("\nMe informe quantas partidas você venceu: ");
    numVitorias = ler.nextInt();

    if (numVitorias >= 6){
      System.out.println("HORA DOS BOSSES!");
    }
    else {
      System.out.println("Insira uma nova ficha!");
    }
  }
}
