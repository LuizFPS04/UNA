import java.util.*;

public class Main {

  public static int retornaMaiorValor (int valor1, int valor2){
    if (valor1 > valor2) return valor1;
    return valor2;
  }
  
  public static int retornaDobro (int valor){
    return valor * 2;
  }
  
  public static double retornaMediaAritmetica(double valor1, double valor2, double valor3){
    return ((valor1 + valor2 + valor3)/3);
  }

  public static int retornaFatorial(int valor){
    int fatorial = 1;
    for (int i = 1; i <= valor; i++){
      fatorial *= i;
    }
    return fatorial;
  }

  public static int retornaSomatorio(int valor){
    int somatorio = 0;
    for (int i = 1; i <= valor; i++){
      somatorio += i;
    }
    return somatorio;
  }
  
  public static void main(String[] args){
    System.out.printf("O maior valor entre 1 e 21 é: %d \n", retornaMaiorValor(1, 21));
    
    System.out.printf("O dobro de 10 é: %d \n", retornaDobro(10));

    System.out.printf("A média de 7.5, 15 e 30 é: %.2f \n", retornaMediaAritmetica(7.5, 15, 30));
    
    System.out.printf("A fatorial de 5 é: %d \n", retornaFatorial(5));
    
    System.out.printf("O somatório de 10 é: %d \n", retornaSomatorio(100));
  }
}
