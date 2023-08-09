package calculo;

public class Homem extends Calculo {

	private Double calculohomem;

	public Homem() {
		super();
	}

	public Homem(String nome, char genero, Integer peso, Double altura, Integer idade, Double calculohomem) {
		super(nome, genero, peso, altura, idade);
		this.calculohomem = calculohomem;
	}

	public Double getCalculohomem() {
		return calculohomem;
	}

	public void setCalculohomem(Double calculohomem) {
		this.calculohomem = calculohomem;
	}

	@Override
	public Double total() {
		if (getCalculohomem() == 1) {
			return (66 + (13.7 * getPeso()) + (5 * getAltura()) - (6.8 * getIdade())) * 1.2;
		} 
		else if (getCalculohomem() == 2) {
			return (66 + (13.7 * getPeso()) + (5 * getAltura()) - (6.8 * getIdade())) * 1.375;
		} 
		else if (getCalculohomem() == 3) {
			return (66 + (13.7 * getPeso()) + (5 * getAltura()) - (6.8 * getIdade())) * 1.55;
		} 
		else if (getCalculohomem() == 4) {
			return (66 + (13.7 * getPeso()) + (5 * getAltura()) - (6.8 * getIdade())) * 1.725;
		} 
		else if (getCalculohomem() == 5) {
			return (66 + (13.7 * getPeso()) + (5 * getAltura()) - (6.8 * getIdade())) * 1.9;
		}
		return getCalculohomem();
	}
}
