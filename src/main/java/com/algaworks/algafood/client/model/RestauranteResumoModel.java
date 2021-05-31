package com.algaworks.algafood.client.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RestauranteResumoModel {
	
	private Long id;
	
	private String nome;
	
	private BigDecimal taxaFrete;
	
	private CozinhaModel cozinha;
}
