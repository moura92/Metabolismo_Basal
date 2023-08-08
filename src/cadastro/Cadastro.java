package cadastro;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.UK);

		System.out.print("Quantas pessoas ? ");
		int quantidade = sc.nextInt();

		double tbmhomem = 0, tbmmulher = 0;
		double fator1 = tbmhomem;
		double fator2 = tbmmulher;
		int numero = 0;
		String[] nome = new String[quantidade];
		char[] genero = new char[quantidade];
		double[] peso = new double[quantidade];
		double[] altura = new double[quantidade];
		int[] idade = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Digite o %dª nome: ", i + 1);
			nome[i] = sc.next();
			System.out.print("Digite o Genero ( m / f ): ");
			genero[i] = sc.next().charAt(0);
			System.out.print("Digite o peso (Kg): ");
			peso[i] = sc.nextDouble();
			System.out.print("Digite a altura (cm): ");
			altura[i] = sc.nextDouble();
			System.out.print("Digite a idade: ");
			idade[i] = sc.nextInt();

			if (genero[i] == 'm') {
				tbmhomem = 66 + (13.8 * peso[i]) + (5 * altura[i]) - (6.8 * idade[i]);
				System.out.println();
				System.out.println("Nivel de Atividade fisica:");
				System.out.println("1 - Sedentários (pouco ou nenhum exercício);");
				System.out.println("2 - Levemente ativo (exercício leve 1 a 3 dias por semana);");
				System.out.println("3 - Moderadamente ativo (exercício moderado, faz esportes 3 a 5 dias por semana);");
				System.out.println("4 - Altamente ativo (exercício pesado de 5 a 6 dias por semana);");
				System.out.println("5 - Extremamente ativo (exercício pesado diariamente e até 2 vezes por dia)");
				System.out.println();
				System.out.print("Escolha um numero: ");
				numero = sc.nextInt();
			}if (genero[i] == 'm') {
				if (numero == 1) {
					fator1 = tbmhomem * 1.2;
				} else if (numero == 2) {
					fator1 = tbmhomem * 1.375;
				} else if (numero == 3) {
					fator1 = tbmhomem * 1.55;
				} else if (numero == 4) {
					fator1 = tbmhomem * 1.725;
				} else if (numero == 5) {
					fator1 = tbmhomem * 1.9;
					
				}System.out.printf("Taxa de metabolismo Basal de %s: %.2f Kcal%n", nome[i], fator1);
				System.out.println();
			}else if (genero[i] == 'f') {
					tbmmulher = 655 + (9.6 * peso[i]) + (1.8 * altura[i]) - (4.7 * idade[i]);
					System.out.println();
					System.out.println("Nivel de Atividade fisica:");
					System.out.println("1 - Sedentários (pouco ou nenhum exercício);");
					System.out.println("2 - Levemente ativo (exercício leve 1 a 3 dias por semana);");
					System.out.println("3 - Moderadamente ativo (exercício moderado, faz esportes 3 a 5 dias por semana);");
					System.out.println("4 - Altamente ativo (exercício pesado de 5 a 6 dias por semana);");
					System.out.println("5 - Extremamente ativo (exercício pesado diariamente e até 2 vezes por dia)");
					System.out.println();
					System.out.print("Escolha um numero: ");
					numero = sc.nextInt();
				}if (genero[i] == 'f') {
					if (numero == 1) {
						fator2 = tbmmulher * 1.2;
					} else if (numero == 2) {
						fator2 = tbmmulher * 1.375;
					} else if (numero == 3) {
						fator2 = tbmmulher * 1.55;
					} else if (numero == 4) {
						fator2 = tbmmulher * 1.725;
					} else if (numero == 5) {
						fator2 = tbmmulher * 1.9;
						
					} System.out.printf("Taxa de metabolismo Basal de %s: %.2f Kcal%n", nome[i], fator2);
				}
			}
			System.out.println();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm ").withZone(ZoneId.systemDefault());
							//Quando for instanciar uma data com "INSTANT" utiliza - se ".withZone(ZoneId.systemDefault()"
			Instant hora = Instant.now();
			System.out.println("Data da Consulta: " + formato.format(hora));
		
		sc.close();
	}
}
	
