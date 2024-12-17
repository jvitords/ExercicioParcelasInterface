package model.services;

public interface ServicoDePagamentosOnline {
	
	Double taxaDePagamento(Double valorDaTaxa);
	Double juros(Double valorDaParcela, Integer mesDaParcela);
}
