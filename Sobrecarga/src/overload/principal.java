package overload;

import overload.cd;
import overload.dvd;
import overload.produto;
import overload.livro;

public class principal {
	
	public static void main(String[] args) {
		
		cd cd = new cd ();
		cd.InserirDadosCd();
		cd.apresentarCd();
		
		dvd dvd = new dvd();
		dvd.InserirDadosCd();
		dvd.apresentarDvd();
		
		livro livro = new livro ();
		livro.inserirDadosLivro();
		livro.apresentarLivro();
		
		produto prod = new produto();
		prod.calcularPrecoVenda();
		prod.calcularPrecoVendaDolar();
		prod.calcularPrecoVendaGenero();

}
}
