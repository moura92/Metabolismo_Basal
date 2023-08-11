package calculo;

public class Calculo {

	private String nome;
	private char genero;
	private Integer peso;
	private Double altura;
	private Integer idade;

	public Calculo() {
		super();
	}

	public Calculo(String nome, char genero, Integer peso, Double altura, Integer idade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
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

	public Double total() {
		return null;
	}

	public String toString1() {
		return "Nivel de Atividade fisica:\n" + "1 - Sedentários (pouco ou nenhum exercício);\n"
				+ "2 - Levemente ativo (exercício leve 1 a 3 dias por semana);\n"
				+ "3 - Moderadamente ativo (exercício moderado, faz esportes 3 a 5 dias por semana);\n"
				+ "4 - Altamente ativo (exercício pesado de 5 a 6 dias por semana);\n"
				+ "5 - Extremamente ativo (exercício pesado diariamente e até 2 vezes por dia)";
	}

	public static void limparTela() { // metodo para limpar o tabuleiro anterior.
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public String toString() {
		return "Nome " + nome + " - " + String.format("%.2f", total()) + " Kcal";
	}
}
