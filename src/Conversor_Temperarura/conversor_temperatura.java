package Conversor_Temperarura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class conversor_temperatura {

	public static void main(String[] args) {
		//variaveis
		double c, f;
		//objetos
		Scanner teclado = new Scanner(System.in);{
		DecimalFormat formatador  = new DecimalFormat("#0.0");
		//entrada
		System.out.println("Conversor de Temperatura");
		System.out.print("Digite a Temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c = (5 * (f - 32)) /9;
		System.out.println("Temperatura em Celsius: " +
		formatador.format(c) + "°C");
		teclado.close();
	}

	}
}
