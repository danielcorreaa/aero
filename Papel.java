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
public class Papel {

	private Long id;
	private String nome;
	private String descricao;
	private List<Funcionario> funcionario;
	private CiaAerea ciaAerea;

}
