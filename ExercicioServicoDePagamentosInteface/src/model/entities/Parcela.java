package model.entities;

import java.time.LocalDate;

public class Parcela {

	private LocalDate dataDeVencimento;
	private Double valorDaParcela;
	
	public Parcela() {
	}
	
	public Parcela(LocalDate dataDeVencimento, Double valorDaParcela) {
		this.dataDeVencimento = dataDeVencimento;
		this.valorDaParcela = valorDaParcela;
	}

	public LocalDate getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(LocalDate dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Double getValorDaParcela() {
		return valorDaParcela;
	}

	public void setValorDaParcela(Double valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	
	
}
