package modelo.entidades;

public class ContaBancaria {
	private Integer numero;
	private String 	titular;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaBancaria() {
		
	}
	public ContaBancaria(Integer numero, String titular, Double saldo, Double limiteSaque) {
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
	public void saque(double valorSaque) {
		saldo -= valorSaque;
	}	
	public String validaSaque(double valorSaque) {
		if(valorSaque > limiteSaque) {
			return "Erro de saque: o valor excedeu o limite de saque";
		} else if(valorSaque > saldo) {
			return "Erro de saque: o valor do saldo é insuficiente";
		}	
		return null;
	}	
}
