package bootcamp.dio.gitgithub;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		// variáveis
		double peso, altura, imc;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#.00");
		System.out.println("Cálculo IMC");

		// entrada
		System.out.println("Digite o seu peso:");
		peso = teclado.nextDouble();
		System.out.println("Digite a sua altura:");
		altura = teclado.nextDouble();

		// lógica
		imc = peso / (altura * altura);

		// saída
		System.out.println("IMC: " + formatador.format(imc));
		teclado.close();

	}

}
