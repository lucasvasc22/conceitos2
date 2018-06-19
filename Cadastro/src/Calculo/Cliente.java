package Calculo;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
	
	private double limiteCredito;
	private double rendaMensal;
	private String rg;
	private String cpf;
	
	public Cliente () {
		
	}
	
	public double getlimiteCredito() {
		return limiteCredito;
	}

	public double getrendaMensal() {
		return rendaMensal;
	}
		
	public String getrg() {
		return rg;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void InserirDadosCliente() {
		limiteCredito = Double.parseDouble(JOptionPane.showInputDialog(null,("Digite o Limite de crédito: ")));
	}
	
	public void apresentarCliente() {
		JOptionPane.showMessageDialog(null, "Limite de crédito: " +getlimiteCredito()+
				"\nlimiteCredito: " +getlimiteCredito()+
				"\nrendaMensal: " +getrendaMensal()+
				"\nrg: " +getrg()+
				"\ncpf: " +getcpf(),"Cliente", JOptionPane.INFORMATION_MESSAGE);
	}
}
