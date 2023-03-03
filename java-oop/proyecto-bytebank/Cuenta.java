// entidad cuenta
public class Cuenta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	// NO retorna valor
	public void depositar(double saldo) {
		// Esta cuenta Esta cuenta
		// this account this account
		// this object

		this.saldo += saldo;
	}

	// Retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -=  valor;
			return true;
		} else {
			return false;
		}
	}
		
	boolean transferir (double valor, Cuenta cuenta ) { 
		if(this.saldo >= valor){
			this.saldo -= valor;
			cuenta.saldo += valor;
			return true;
		}else {
			return false;
		}
		
	}
	
}