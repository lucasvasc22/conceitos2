package overload;

import javax.swing.JOptionPane; 

public class dvd extends produto {

	private String diretor;
	private String duracao;
	private String censura;
	
	public dvd () {
		
	}
	
	public String getdiretor () {
		return diretor;
	}
	
	public String getduracao() {
		return duracao;
	}
	
	public String getcensura() {
		return censura;
	}
	
	public void InserirDadosCd() {
		diretor = JOptionPane.showInputDialog(null,("Digite o Nome do Diretor: "));
		duracao = JOptionPane.showInputDialog(null,("Digite a Duração do Filme: "));
		censura = JOptionPane.showInputDialog(null,("Digite a Censura: "));
	}
	
	public void apresentarDvd() {
		JOptionPane.showMessageDialog(null, "Nome do Diretor: "+this.diretor);
		JOptionPane.showMessageDialog(null, "Duração: "+this.duracao);
		JOptionPane.showMessageDialog(null, "Censura: "+this.censura);
	}
}
