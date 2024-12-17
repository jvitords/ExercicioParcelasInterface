package model.services;

import java.time.LocalDate;
import model.entities.Contratos;
import model.entities.Parcela;

public class ServicoDeContato {

	private Contratos contrato;
	private ServicoDePagamentosOnline servicoOnline;
	
	public ServicoDeContato() {
	}

	public ServicoDeContato(Contratos contrato, ServicoDePagamentosOnline servicoDePagamentosOnline) {
		this.contrato = contrato;
		this.servicoOnline = servicoDePagamentosOnline;
	}

	public void processarContrato(Contratos contrato, Integer mesesDeParcelas, ServicoDePagamentosOnline servicoDePagamentosOnline) {
		// ******************
		// pegar uma parcela, descobrir o valor da parcela, calcular o juros e a taxa e somar na parcela. E calcular a data de vencimento
		
		Double valorDeCadaParcela = contrato.getValorDoContrato() / mesesDeParcelas;
		
		for(int i = 1; i <= mesesDeParcelas; i++) {
			// somar o valor do juros de cada parcela + taxa de serviço
			
			Double valorComJuros = valorDeCadaParcela + (servicoDePagamentosOnline.juros(valorDeCadaParcela, i));
			
			Double valorComTaxa = valorComJuros + (servicoDePagamentosOnline.taxaDePagamento(valorDeCadaParcela));
			
			LocalDate dataDeVencimento = contrato.getDataDoContrato().plusMonths(i); // adicionar um mês
			
			contrato.adicionarParcela(new Parcela(dataDeVencimento, valorComTaxa));
		}
		System.out.println("Parcelas registradas com sucesso!");
	}
	
	public Contratos getContrato() {
		return contrato;
	}

	public void setContrato(Contratos contrato) {
		this.contrato = contrato;
	}
}
