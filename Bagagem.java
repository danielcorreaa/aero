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
public class Bagagem {

	private Long id;	
	private Double peso;
	private TipoBagagem tipoBagagem;
	private Economica economica;
	private Primeira primeira;
	private Executiva executiva;
	
	
}
