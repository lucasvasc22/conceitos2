package Calculo;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{

		private double salarioBase;
		private double salarioFinal;
		
		public Funcionario() {
			
		}
		
		public double getsalarioBase() {
			return salarioBase;
		}
				
		public double getsalarioFinal() {
			return salarioFinal;
		}
		
		
		public void inserirDadosFuncionario() {
			this.salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o Sal�rio Base: "));
			this.salarioFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o Sal�rio Final: "));
		}
		
		public void apresentarFuncionario () {
			JOptionPane.showMessageDialog(null, "Sal�rio Base: "+this.salarioBase);
			JOptionPane.showMessageDialog(null, "Sal�rio Final: "+this.salarioFinal);
		}
}
