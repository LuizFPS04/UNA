/* 6) Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32). */

import java.util.*;

class Main {
  public static void main(String[] args) {
    double temperaturaCelsius, temperaturaFahrenheit;

    Scanner ler = new Scanner(System.in);

    System.out.printf("Informe a temperatura em celsius: ");
    temperaturaCelsius = ler.nextDouble();
  
    temperaturaFahrenheit = ((temperaturaCelsius * 1.8) + 32);

    System.out.printf("A temperatura %.0f° Celsius, em Fahrenheit é igual a: %.2f°", temperaturaCelsius, temperaturaFahrenheit);
  }
}