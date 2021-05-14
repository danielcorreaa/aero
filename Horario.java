package com.mercado.product.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Horario {
	
	private Long id;
	private String codigo;
	private LocalDate partida;
	private LocalDate chegada;
	private Integer qtdEconomica;
	private Integer qtdPrimeira;
	private Integer qtdExecutiva;
	private Aviao aviao;
	private Rota rota;	 

}
