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
public class Aeroporto {

	private String id;
	private String nome;
	private String codigo;	
	private Endereco endereco;	
	private List<Rota> rotas;
	
}
