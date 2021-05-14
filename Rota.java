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
public class Rota {

	private Long id;
	private String nome;
	private String descricao;
	private List<Aeroporto> aeroporto;
	private List<Horario> horarios;
	private CiaAerea ciaAerea;

}
