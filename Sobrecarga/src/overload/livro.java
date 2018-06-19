package overload;

import javax.swing.JOptionPane;

public class livro extends produto{
	
	private String autor;
	private String editora;
	private String edicao;
	
	public livro () {
		
	}
	
	private String getautor () {
		return autor;
	}
	
	private String geteditora () {
		return editora;
	}
	
	private String getedicao () {
		return edicao;
	}
	
	public void calcularPrecoVenda() {
		
	}
	
	public void inserirDadosLivro () {
		autor = JOptionPane.showInputDialog(null,("Digite o Autor: "));
		editora = JOptionPane.showInputDialog(null,("Digite a Editora: "));
		edicao = JOptionPane.showInputDialog(null,("Digite a Edição: "));
	}
	
	public void apresentarLivro () {
		JOptionPane.showMessageDialog(null, "Autor: "+this.autor);
		JOptionPane.showMessageDialog(null, "Editora: "+this.editora);
		JOptionPane.showMessageDialog(null, "Edição: "+this.edicao);
	}
}
