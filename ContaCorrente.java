package entidade;

import entidade.Conta;

public class ContaCorrente extends Conta {
	
	private double limite;

	public ContaCorrente(int numero, String nome, double saldo, double limite) {
		super(numero, nome, saldo);
		this.limite = limite;
	}

	@Override
	public String toString() {
		return " ContaCorrente " + mostrar() + " limite = " + limite + " ";
	}

	
}