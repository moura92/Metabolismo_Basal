package cadastro;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import calculo.Calculo;
import calculo.Homem;

public class Cadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		List<Calculo> lista = new ArrayList<>();

		Calculo calc = new Calculo();

		System.out.print("Quantas pessoas ? ");
		int quantidade = sc.nextInt();

		sc.nextLine();
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Digite o %dª nome: ", i + 1);
			String nome = sc.nextLine();
			System.out.print("Digite o Genero ( m / f ): ");
			char genero = sc.next().charAt(0);
			System.out.print("Digite o peso (Kg): ");
			Integer peso = sc.nextInt();
			System.out.print("Digite a altura (cm): ");
			Double altura = sc.nextDouble();
			System.out.print("Digite a idade: ");
			Integer idade = sc.nextInt();
			System.out.println();

			if (genero == 'm') {
				System.out.println(calc.toString1());
				System.out.print("Escolha um numero: ");
				Double calculohomem = sc.nextDouble();

				Calculo calculo = new Homem(nome, genero, peso, altura, idade, calculohomem);
				lista.add(calculo);

			}
		}
		for (Calculo x : lista) {
			System.out.println(x.toString());
		}
		/*
		 * System.out.printf("Taxa de metabolismo Basal de %s: %.2f Kcal%n", nome[i],
		 * fator1); System.out.println(); } else if (genero[i] == 'f') { tbmmulher = 655
		 * + (9.6 * peso[i]) + (1.8 * altura[i]) - (4.7 * idade[i]);
		 * System.out.println(); System.out.println("Nivel de Atividade fisica:");
		 * System.out.println("1 - Sedentários (pouco ou nenhum exercício);");
		 * System.out.
		 * println("2 - Levemente ativo (exercício leve 1 a 3 dias por semana);");
		 * System.out.
		 * println("3 - Moderadamente ativo (exercício moderado, faz esportes 3 a 5 dias por semana);"
		 * ); System.out.
		 * println("4 - Altamente ativo (exercício pesado de 5 a 6 dias por semana);");
		 * System.out.
		 * println("5 - Extremamente ativo (exercício pesado diariamente e até 2 vezes por dia)"
		 * ); System.out.println(); System.out.print("Escolha um numero: "); numero =
		 * sc.nextInt(); } if (genero[i] == 'f') { if (numero == 1) { fator2 = tbmmulher
		 * * 1.2; } else if (numero == 2) { fator2 = tbmmulher * 1.375; } else if
		 * (numero == 3) { fator2 = tbmmulher * 1.55; } else if (numero == 4) { fator2 =
		 * tbmmulher * 1.725; } else if (numero == 5) { fator2 = tbmmulher * 1.9;
		 * 
		 * } System.out.printf("Taxa de metabolismo Basal de %s: %.2f Kcal%n", nome[i],
		 * fator2); } } System.out.println();
		 */
		System.out.println();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm ").withZone(ZoneId.systemDefault());
		// Quando for instanciar uma data com "INSTANT" utiliza - se
		// ".withZone(ZoneId.systemDefault()"
		Instant hora = Instant.now();
		System.out.println("Data da Consulta: " + formato.format(hora));

		sc.close();
	}
}
