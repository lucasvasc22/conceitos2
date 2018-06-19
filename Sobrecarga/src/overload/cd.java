package overload;

import javax.swing.JOptionPane;

public class cd extends produto{
	
	private String artista;
	private String gravadora;
	private String paisOrigem;
	
	public cd () {
		
	}
	
	public String getartista () {
		return artista;
	}
	
	public String getgravadora () {
		return gravadora;
	}
	
	public String getpaisOrigem () {
		return paisOrigem;
	}
	
	public void InserirDadosCd() {
		artista = JOptionPane.showInputDialog(null,("Digite o Nome do artista: "));
		gravadora = JOptionPane.showInputDialog(null,("Digite a Gravadora: "));
		paisOrigem = JOptionPane.showInputDialog(null,("Digite o País de Origem: "));
	}
	
	public void apresentarCd() {
		JOptionPane.showMessageDialog(null, "Nome do artista: "+this.artista);
		JOptionPane.showMessageDialog(null, "Gravadora: "+this.gravadora);
		JOptionPane.showMessageDialog(null, "País de origem: "+this.paisOrigem);
	}
}
