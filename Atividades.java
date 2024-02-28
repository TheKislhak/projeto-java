package atividade;

import java.util.Scanner;
public class Atividades {

	public static void main(String[] args) {
		// variavel
		String nome;
		double a;
		//intercalar classe Scanner
		Scanner ler = new Scanner(System.in);

		// Entrada de dados
		System.out.println("informe seu nome: ");
		nome = ler.nextLine();

		System.out.println("Informe sua idade");
		a = ler.nextDouble();
		
		// Porcessamento
		System.out.println("O seu nome é " + nome +" e sua idade "+ a);
		ler.close();

	}

}
