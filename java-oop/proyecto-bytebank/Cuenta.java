// entidad cuenta
public class Cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	// NO retorna valor
	public void depositar(double saldo) {
		// Esta cuenta Esta cuenta
		// this account this account
		// this object

		this.saldo = this.saldo + saldo;
	}

	// Retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

}