import java.util.*;

class Main {
  public static void main(String[] args) {
    double altura, peso, imc;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Por favor, me informe sua altura em metros(m): ");
    altura = ler.nextDouble();
    System.out.printf("Agora, me informe seu peso em kilos(kg): ");
    peso = ler.nextDouble();

    imc = peso/(Math.pow(altura, 2));

    if (imc < 20){
      System.out.printf("Você está abaixo do peso!\nSeu IMC: %.2f", imc);
    }
    else if ((imc >= 20) && (imc < 25)){
      System.out.printf("Você tem um peso normal!\nSeu IMC: %.2f", imc);
    }
    else if ((imc >= 25) && (imc < 30)){
      System.out.printf("Você tem sobre peso!\nSeu IMC: %.2f", imc);
    }
    else if ((imc >= 30) && (imc < 40)){
      System.out.printf("Você está obeso!\nSeu IMC: %.2f", imc);
    }
    else {
      System.out.printf("Você está em situação de obesidade mórbida! \nSeu IMC: %.2f", imc);
    }
  }
}