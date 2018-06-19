package Calculo;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente ();
		cli.InserirDadosCliente();
		cli.apresentarCliente();
		
		Fornecedor forn = new Fornecedor();
		forn.InserirDadosFornecedor();
		forn.apresentarFornecedor();
		
		Funcionario func = new Funcionario ();
		func.inserirDadosFuncionario();
		func.apresentarFuncionario();
		
		Pessoa pess = new Pessoa();
		pess.mostrarTelefones();

		
	}

}
