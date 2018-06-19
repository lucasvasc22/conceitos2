package Calculo;

import javax.swing.JOptionPane;

public class Pessoa {

	public int codigo;
	public String nome;
	protected String endereco;
	protected String bairro;
	protected String cidade;
	protected String uf;
	protected String telefone;
	protected String celular;
	
	public Pessoa() {
		
	}
	
	public int getcodigo() {
		return codigo;
	}
	
	public String getnome () {
		return nome;
	}
	
	public String getendereco() {
		return endereco;
	}
	
	public String getbairro() {
		return bairro;
	}
	
	public String getcidade() {
		return cidade;
	}
	
	public String getuf() {
		return uf;
	}
	
	public String gettelefone() {
		return telefone;
	}
	
	public String getcelular() {
		return celular;
	}
	
	
	public void mostrarTelefones() {
		System.out.println("Telefone da Pessoa: " +this.telefone);
	}
}
