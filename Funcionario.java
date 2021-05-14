package com.mercado.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Funcionario {
	
	private String codigo;
	private String contaCorrente;
	private Papel papel;

}
