package cadastro;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import calculo.Calculo;
import calculo.Homem;
import calculo.Mulher;

public class Cadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		List<Calculo> lista = new ArrayList<>();

		try {
			System.out.println("---------- CALCULADORA DE TAXA METABOLISMO BASAL (TMB) ----------");
			System.out.println();
			System.out.print("Digite a quantidade de pessoas: ");
			int quantidade = sc.nextInt();

			for (int i = 0; i < quantidade; i++) {
				System.out.printf("Digite o nome da %dª pessoa: ", i + 1);
				String nome = sc.next();
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
					System.out.println(new Calculo().toString1());
					System.out.print("Escolha um numero: ");
					Double calculohomem = sc.nextDouble();
					System.out.println();
					Calculo calculo = new Homem(nome, genero, peso, altura, idade, calculohomem);
					lista.add(calculo);
				} else if (genero == 'f') {
					System.out.println(new Calculo().toString1());
					System.out.print("Ecolha um numero: ");
					Double calculomulher = sc.nextDouble();
					System.out.println();
					lista.add(new Mulher(nome, genero, peso, altura, idade, calculomulher));
				}
			}

			System.out.println("Resultado(s):");
			for (Calculo x : lista) {
				System.out.println(x.toString());
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro de digitação, por favor digite um comando válido.");
		}
		System.out.println();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm ").withZone(ZoneId.systemDefault());
		// Quando for instanciar uma data com "INSTANT" utiliza - se
		// ".withZone(ZoneId.systemDefault()"
		Instant hora = Instant.now();
		System.out.println("Data da Consulta: " + formato.format(hora));

		sc.close();
	}
}
