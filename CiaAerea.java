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
public class CiaAerea {

	private Long id;
	private String nome;
	private List<Papel> papeis;
	private List<Rota> rotas;
	private List<Aviao> avioes;
	

}
