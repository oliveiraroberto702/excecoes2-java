package modelo.entidades;

import modelo.excecoes.DominioExcecoes;

public class ContaBancaria {
	private Integer numero;
	private String 	titular;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaBancaria() {
		
	}
	public ContaBancaria(Integer numero, String titular, Double saldo, Double limiteSaque) { // throws DominioExcecoes{
		if(saldo < 0 || limiteSaque<0) {
			throw new DominioExcecoes("não se pode  lancar valores negativos");
		}
		this.numero=numero;
		this.titular=titular;
		this.saldo=saldo;
		this.limiteSaque=limiteSaque;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero=numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	public void saque(double valorSaque) { // throws DominioExcecoes {
		if(valorSaque > limiteSaque) {
			throw new DominioExcecoes("Erro de saque: o valor excedeu o limite de saque");
		} else if(valorSaque > saldo) {
			throw new DominioExcecoes("Erro de saque: o valor do saldo é insuficiente");
		}	
		saldo -= valorSaque;
	}	
}
