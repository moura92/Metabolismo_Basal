package calculo;

public class Mulher extends Calculo {

	private Double calculomulher;

	public Mulher() {
		super();
	}

	public Mulher(String nome, char genero, Integer peso, Double altura, Integer idade, Double calculomulher) {
		super(nome, genero, peso, altura, idade);
		this.calculomulher = calculomulher;
	}

	public Double getCalculomulher() {
		return calculomulher;
	}

	public void setCalculomulher(Double calculomulher) {
		this.calculomulher = calculomulher;
	}
									
	@Override
	public Double total() { 
		if (getCalculomulher() == 1) {
			return (655 + (9.6 * getPeso()) + (1.8 * getAltura()) - (4.7 * getIdade())) * 1.2;
		} 
		else if (getCalculomulher() == 2) {
			return (655 + (9.6 * getPeso()) + (1.8 * getAltura()) - (4.7 * getIdade())) * 1.375;
		} 
		else if (getCalculomulher() == 3) {
			return (655 + (9.6 * getPeso()) + (1.8 * getAltura()) - (4.7 * getIdade())) * 1.55;
		} 
		else if (getCalculomulher() == 4) {
			return (655 + (9.6 * getPeso()) + (1.8 * getAltura()) - (4.7 * getIdade())) * 1.725;
		} 
		else if (getCalculomulher() == 5) {
			return (655 + (9.6 * getPeso()) + (1.8 * getAltura()) - (4.7 * getIdade())) * 1.9;
		}
		return getCalculomulher();
	}
}
