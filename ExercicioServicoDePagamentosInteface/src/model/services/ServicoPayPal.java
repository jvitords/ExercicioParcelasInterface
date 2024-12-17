package model.services;

public class ServicoPayPal implements ServicoDePagamentosOnline{
	
	public Double juros(Double valorDaParcela, Integer mesDaParcela) {
		
		return (valorDaParcela * 0.01) * mesDaParcela; // retorna 1% de juros sobre o valor da parcela
	}
	
	public Double taxaDePagamento(Double valorDaParcela){
		
		return valorDaParcela * 0.02; // retorna 2% de taxa sobre o valor da parcela 
	}
	
	
}
