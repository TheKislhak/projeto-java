package atividade;

import java.util.Scanner;
public class Fluxograma {

	public static void main(String[] args) {
		//  Variavel
		double horatrab, valorhora, salbruto, salliquido, inss;
		Scanner ler = new Scanner(System.in);

		//intercalar classe Scanner
		System.out.println("Insira a hora trabalhada: ");
		horatrab = ler.nextDouble();

		// Entrada de dados
		System.out.println("Insira o valor da hora: ");
		valorhora = ler.nextDouble();

		// Processamento
		System.out.println(salbruto = horatrab*valorhora);
		System.out.println(inss = salbruto*0.12);
		System.out.println(salliquido = salbruto - inss);

		// Saída
		System.out.println("O valor do salário bruto é: " + salbruto);
		System.out.println("O valor do salário liquido é: " + salliquido);
		ler.close();

	}

}
