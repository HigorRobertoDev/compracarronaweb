package br.com.compracarronaweb.model;

public class Carro {
	
	private String nome;
	private String modelo;
	private int ano;
	private int portas;
	private String cor;
	
	public Carro(String nome, String modelo, int ano, int portas, String cor) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.portas = portas;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
