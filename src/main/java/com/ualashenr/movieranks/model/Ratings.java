package com.ualashenr.movieranks.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratings {
	
	@JsonProperty("Source")
	private String source;
	@JsonProperty("Value")
	private String valor;
	
	public Ratings() {
	}

	public Ratings(String source, String valor) {
		this.source = source;
		this.valor = valor;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
