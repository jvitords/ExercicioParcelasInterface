package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contratos {

	private Integer numeroDeContato;
	private LocalDate dataDoContrato;
	private Double valorDoContrato;
	private Parcela parcela;
	List<Parcela> listaDeParcelas = new ArrayList<Parcela>();
	
	public Contratos() {
	}

	public Contratos(Integer numeroDeContato, LocalDate dataDoContrato, Double valorDoContrato) {
		this.numeroDeContato = numeroDeContato;
		this.dataDoContrato = dataDoContrato;
		this.valorDoContrato = valorDoContrato;
	}
	
	public void adicionarParcela(Parcela parcela) {
		
		listaDeParcelas.add(parcela);
	}
	
	public void mostrarParcelas() { // mostrar parcelas com data de vencimento e valor
		
		int i = 1;
		for(Parcela parcela : listaDeParcelas) {
			
			System.out.println("\nParcela " + i + 
					"\nData de vencimento: " + parcela.getDataDeVencimento().getDayOfMonth() + "/" + parcela.getDataDeVencimento().getMonthValue()+ "/" + parcela.getDataDeVencimento().getYear() + 
					"\nValor da parcela: R$" + parcela.getValorDaParcela());
			i++;
		}
	}

	public Integer getNumeroDeContato() {
		return numeroDeContato;
	}

	public void setNumeroDeContato(Integer numeroDeContato) {
		this.numeroDeContato = numeroDeContato;
	}

	public LocalDate getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(LocalDate dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public Double getValorDoContrato() {
		return valorDoContrato;
	}

	public void setValorDoContrato(Double valorDoContrato) {
		this.valorDoContrato = valorDoContrato;
	}

	
	public Parcela getParcela() {
		return parcela;
	}

	
	public void setParcela(Parcela parcela) {
			this.parcela = parcela;
		}
	
	
}
