package overload;

public class produto {

	private int cod;
	private String descricao;
	private String genero;
	private int estDisponivel;
	private double precoCusto;
	private double precoVenda;
	
	public produto () {
		
	}
	
	private int getcod () {
		return cod;
	}
	
	private String getgenero () {
		return genero;
	}
	
	private int getestDisponivel () {
		return estDisponivel;
	}
	
	private double getprecoCusto () {
		return precoCusto;
	}
	
	private double getprecoVenda () {
		return precoVenda;
	}
	
	public void calcularPrecoVenda () {
		
	}
	
	public void calcularPrecoVendaDolar () {
		
		double cotacaoDolar = precoVenda * 3.77;
	}
	
	public void calcularPrecoVendaGenero () {
		
	}
}
