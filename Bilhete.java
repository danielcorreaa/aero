package com.mercado.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Bilhete {
	
	private Long id;	
	private Integer numero;
	private String acessorio;
	private Passageiro passageiro;
	private SituacaoBilhete situacaoBilhete;
	private TipoBilhete tipoBilhete;
	private Horario horario;
	
	
	void reservar(Passageiro passageiro) {
		
	}
	
	void comprar() {
		
	}
	
	void cancelarReserva() {
		
	}
	
	void checkInbagagem() {
		
	}
	
	abstract void maximoBagagens();

}
