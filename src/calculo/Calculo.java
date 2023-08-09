package calculo;

public class Calculo {

	private String nome;
	private char genero;
	private Integer peso;
	private Double altura;
	private Integer idade;
	private Integer fator;

	public Calculo(String nome, char genero, Integer peso, Double altura, Integer idade, Integer fator) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.fator = fator;
	}

	public Calculo() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double calculohomem() {

		if (fator == 1) {
			return (66 + (13.8 * peso) + (5 * altura) - (6.8 * idade)) * 1.2;
		} else if (fator == 2) {
			return (66 + (13.8 * peso) + (5 * altura) - (6.8 * idade)) * 1.375;
		} else if (fator == 3) {
			return (66 + (13.8 * peso) + (5 * altura) - (6.8 * idade)) * 1.55;
		} else if (fator == 4) {
			return (66 + (13.8 * peso) + (5 * altura) - (6.8 * idade)) * 1.725;
		} else if (fator == 5) {
			return (66 + (13.8 * peso) + (5 * altura) - (6.8 * idade)) * 1.9;
		}
		return null;
	}

	public String toString1() {
		return "Nivel de Atividade fisica:\n" + "1 - Sedentários (pouco ou nenhum exercício);\n"
				+ "2 - Levemente ativo (exercício leve 1 a 3 dias por semana);\n"
				+ "3 - Moderadamente ativo (exercício moderado, faz esportes 3 a 5 dias por semana);\n"
				+ "4 - Altamente ativo (exercício pesado de 5 a 6 dias por semana);\n"
				+ "5 - Extremamente ativo (exercício pesado diariamente e até 2 vezes por dia)\n";
	}

	public String toString() {
		return "Nome: " 
				+ nome + " - " 
				+ String.format("%.2f", calculohomem()) 
				+ " Kcal";
	}
}
