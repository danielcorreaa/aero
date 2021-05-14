package com.mercado.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoBagagem {
	
	private Long id;	
	private String nome;
	private Double pesoMax;

}
