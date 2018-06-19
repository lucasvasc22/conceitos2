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
			this.salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Base: "));
			this.salarioFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Final: "));
		}
		
		public void apresentarFuncionario () {
			JOptionPane.showMessageDialog(null, "Salário Base: "+this.salarioBase);
			JOptionPane.showMessageDialog(null, "Salário Final: "+this.salarioFinal);
		}
}
