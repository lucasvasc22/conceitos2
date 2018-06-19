package Calculo;

import javax.swing.JOptionPane;

public class Fornecedor extends Pessoa{

		private String cnpj;
		private String ie;
		private String contato;
		
		public Fornecedor() {
			
		}
		
		public String getcnpj() {
			return cnpj;
		}
		
		public String getie() {
			return ie;
		}
			
		public String getcontato() {
			return contato;
		}
		
		public void InserirDadosFornecedor () {
			this.cnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
			this.ie = JOptionPane.showInputDialog("Digite o IE: ");
			this.contato = JOptionPane.showInputDialog("Digite o Contato: ");
			this.codigo = Integer.parseInt (JOptionPane.showInputDialog("Digite o Codigo: "));
			this.nome = JOptionPane.showInputDialog("Digite o Nome: ");
			this.endereco = JOptionPane.showInputDialog("Digite o Endereço: ");
			this.bairro = JOptionPane.showInputDialog("Digite o Bairro: ");
			this.cidade = JOptionPane.showInputDialog("Digite a Cidade: ");
			this.uf = JOptionPane.showInputDialog("Digite o UF: ");
			this.telefone = JOptionPane.showInputDialog("Digite o Telefone: ");
			this.celular = JOptionPane.showInputDialog("Digite o Celular: ");

		}
		
		public void apresentarFornecedor() {
			JOptionPane.showMessageDialog(null, "CNPJ: "+this.cnpj);
			JOptionPane.showMessageDialog(null, "IE: "+this.ie);
			JOptionPane.showMessageDialog(null, "Contato: "+this.contato);
			JOptionPane.showMessageDialog(null, "Código: "+this.codigo);
			JOptionPane.showMessageDialog(null, "Nome: "+this.nome);
			JOptionPane.showMessageDialog(null, "Endereço: "+this.endereco);
			JOptionPane.showMessageDialog(null, "bairro: "+this.bairro);
			JOptionPane.showMessageDialog(null, "Cidade: "+this.cidade);
			JOptionPane.showMessageDialog(null, "UF: "+this.uf);
			JOptionPane.showMessageDialog(null, "Telefone: "+this.telefone);
			JOptionPane.showMessageDialog(null, "Celular: "+this.celular);
		}
}
