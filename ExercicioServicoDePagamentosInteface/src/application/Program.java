package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.entities.Contratos;
import model.services.ServicoDeContato;
import model.services.ServicoPayPal;


public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// criar data 
		String data = "25/10/2018";
		LocalDate dataFormatada = LocalDate.parse(data, formatoData);
		
		int numeroDoContrato = 8028;
		Double valorDoContrato = 600.0;
		Contratos contrato = new Contratos(numeroDoContrato, dataFormatada, valorDoContrato);

		ServicoDeContato servico = new ServicoDeContato(contrato, new ServicoPayPal());
		servico.processarContrato(contrato, 3, new ServicoPayPal());
		contrato.mostrarParcelas();
		
	}

}
