package com.mercado.product.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aviao {

	private Long id;
	private String codigo;
	private Double carga;
	private Integer qtdEconomica;
	private Integer qtdPrimeira;
	private Integer qtdExecutiva;
	private CiaAerea ciaAerea;
	private List<Horario> horarios;

	

}
