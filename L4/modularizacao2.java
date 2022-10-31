import java.util.*;

public class Main {

  public static int retornaSoma(int valor1, int valor2){
      return valor1 + valor2;
    }

  public static int retornaSubtracao(int valor1, int valor2){
    if (valor1 > valor2) return valor1 - valor2;
    return valor2 - valor1;
  }

  public static int retornaMultiplicacao(int valor, int fator){
    int produto = 0;
    for (int i = 0; i < fator; i++){
      produto += valor;
    }
    return produto;
  }
  
  public static void main(String[] args){
    
    System.out.printf("A soma de 5 e 21 é: %d \n", retornaSoma(5, 21));
    System.out.printf("A subtração entre 102 e 10 é: %d \n", retornaSubtracao(10, 102));
    System.out.printf("A multiplicação de 5 e 5 é: %d \n", retornaMultiplicacao(5, 5));
    
  }
}
