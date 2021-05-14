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
public class Endereco {

	private Long id;
	private String rua;
	private String complemento;
	private String bairro;
	private String pais;
	private String cidade;
	private String estado;
	private Integer numero;

	

}
