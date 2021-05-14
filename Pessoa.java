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

public abstract class Pessoa {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private Usuario usuario;
	private String senha;
	private LocalDate dataNascimento;
	private Endereco endereco;

	
}
