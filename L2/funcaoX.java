import java.util.*;

class Main {
  public static void main(String[] args) {
    double valorX;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Por favor, me informe o valor de X: ");
    valorX = ler.nextDouble();

    if (valorX < -2){
      System.out.printf("f(x) = %.2f", 2 * valorX + 2);
    }
    else if ((valorX >= -2) && (valorX < 3)){
      System.out.printf("f(x) = 3");
    }
    else {
      System.out.printf("f(x) = %.2f", -valorX);
    }
  }
}